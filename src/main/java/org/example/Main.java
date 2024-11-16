package org.example;

import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        File file = new File(System.getProperty("user.dir") + "/src/main/resources/debby.txt");
        Commander commander = new Commander(file);

        System.out.print("Sqlite> ");

        while (true) {
            try {
                String input = scan.next();
                if (".exit".equalsIgnoreCase(input)) {
                    System.exit(0);
                }
                commander.handle(input);
            } catch (Exception e) {
                System.out.println("No input provided. Exiting...");
                break;
            }
        }
        scan.close();
    }
}
