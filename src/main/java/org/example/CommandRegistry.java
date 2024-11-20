package org.example;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class CommandRegistry {
    private final Map<String, Command> commands = new HashMap<>();

    public CommandRegistry(File file) {
        // Map commands to their implementations
        commands.put("READ", new ReadCommand(file));
        //commands.put("UPDATE", new UpdateCommand(file));
        //commands.put("INSERT", new InsertCommand(file));
        commands.put("DELETE", new DeleteCommand(file));
    }

    public Command getCommand(String input) {
        return commands.getOrDefault(input.toUpperCase(), () -> System.out.println("Unrecognized Command: " + input));
    }
}

