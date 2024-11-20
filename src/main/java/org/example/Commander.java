package org.example;

import java.io.File;

public class Commander {
    private final CommandRegistry registry;

    public Commander(File file) {
        this.registry = new CommandRegistry(file);
    }

    public void handle(String input) {
        Command command = registry.getCommand(input);
        command.execute();
    }
}

