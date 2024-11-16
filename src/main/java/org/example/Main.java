package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sqlite>");

        while (true) {
            try {
                String input = scan.next();
                if (input.equals(".exit")) {
                    System.exit(0);
                } else {
                    controller(input);
                    System.out.println("Unrecognized Command: " + input);
                }
            } catch (Exception e) {
                System.out.println("No input provided. Exiting...");
                break;
            }
        }

        scan.close();
    }


    public static int controller(String input) {
        Commander commander = new Commander(input);
        System.out.println("Status code: completed");
        return 0;
    }
}
