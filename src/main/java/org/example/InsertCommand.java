package org.example;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;

public class InsertCommand implements Command {
    private final File file;

    public InsertCommand(File file) {
        this.file = file;
    }

    @Override
    public void execute() {
        /**try (

												
				} catch (Exception e) {
            System.out.println(e.getMessage());
        }**/
    }
}

