package org.example;

import java.util.List;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;

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
           
						// Find match and remove it. 
						// TOODO
						br.lines().filter(line -> line.contains("Cats"))
										.forEach( line -> {	pw.print(line);});
								 

				} catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

