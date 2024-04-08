package org.example;
import java.io.IOException;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input;

        while(true) {
            System.out.print("Sqlite> ");
            input = scan.next().trim();

            if (input.equals(".exit")) {
                System.exit(0);
            } else {
                System.out.println("Unrecognized Command: " + input);

            }
        }
    }
}