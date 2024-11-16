package org.example;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;

// Class that interacts with the store filed
public class Commander {
				final File file = new File(System.getProperty("user.dir") 
																+ "/debby.txt"); 

				public Commander(String input) {
								// Initial Commander
								switch(input) {
												case("READ"):
																read();
												case("UPDATE"):
																update();
												case("INSERT"):
																create();
												case("DELETE"):
																delete();
								}
				}

				public void read() {
								try{

												System.out.println("Initiating read");
												System.out.println(file.toString());

												InputStreamReader r = new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8);		
												final BufferedReader br = new BufferedReader(r);
												final Stream<String> lines = br.lines();
												lines.forEach(System.out::println);		
								} catch(Exception e){
												System.out.println(e.getMessage());
								}
				}

				public void update() {

				}

				public void create() {
				}

				public void delete() {
				}
}
