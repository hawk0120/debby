package org.example;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class DeleteCommand implements Command {
    private final File file;

    public DeleteCommand(File file) {
        this.file = file;
    }

    @Override
    public void execute() {
        try (
	 			    
						PrintWriter pw = new PrintWriter(file);
				    BufferedReader br = new BufferedReader(
										new InputStreamReader(
														new FileInputStream(file), StandardCharsets.UTF_8))) {
           
				    System.out.println("Initiating Delete");
           
						br.lines()
												.forEach(System.out::println);
//										.forEach( line -> {	
//										if(true){
//												System.out.println("The line contains cats");	
//														//pw.print(line);
//														};
//												});
								 

				} catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

