package org.example;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;

public class ReadCommand implements Command {
    private final File file;

    public ReadCommand(File file) {
        this.file = file;
    }

    @Override
    public void execute() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))) {
            System.out.println("Initiating read");
            br.lines().forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

