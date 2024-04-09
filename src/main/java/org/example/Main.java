package org.example;
import java.io.IOException;
import java.util.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printPrompt();
            String input = scanner.nextLine();
            if (input.startsWith(".")) {
                switch (doMetaCommand(input)) {
                    case META_COMMAND_SUCCESS:
                        continue;
                    case META_COMMAND_UNRECOGNIZED_COMMAND:
                        System.out.println("Unrecognized command '" + input + "'");
                        continue;
                }
            }

            Statement statement = new Statement();
            switch (prepareStatement(input, statement)) {
                case PREPARE_SUCCESS:
                    break;
                case PREPARE_UNRECOGNIZED_STATEMENT:
                    System.out.println("Unrecognized keyword at start of '" + input + "'");
                    continue;
            }

            executeStatement(statement);
            System.out.println("Executed.");
        }
    }

    private static void printPrompt() {
        System.out.print("prompt> ");
    }

    private static int doMetaCommand(String input) {
        // Implementation of doMetaCommand
        return 0;
    }

    private static int prepareStatement(String input, Statement statement) {
        // Implementation of prepareStatement
        return 0;
    }

    private static void executeStatement(Statement statement) {
        // Implementation of executeStatement
    }

    private static final int META_COMMAND_SUCCESS = 0;
    private static final int META_COMMAND_UNRECOGNIZED_COMMAND = 1;
    private static final int PREPARE_SUCCESS = 0;
    private static final int PREPARE_UNRECOGNIZED_STATEMENT = 1;

    private static class Statement {
        // Definition of Statement class
    }
}
