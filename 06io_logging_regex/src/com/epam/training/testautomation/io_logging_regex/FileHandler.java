package com.epam.training.testautomation.io_logging_regex;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileHandler {
    private final static Logger LOG =
            Logger.getLogger(Logger.class.getName());
    public String readFromFile(String path1) {
        Path path = Paths.get(path1);
        String allContent = "";
        try {
            byte[] bytes = Files.readAllBytes(path);
            allContent = new String(bytes);

        } catch (IOException exception) {
            LOG.log(Level.SEVERE, "The input file cannot be opened!");
        }
        return allContent;
    }

    public void writeToFile(String path, String content) {
        Path outputPath = Paths.get(path);
        try (BufferedWriter writer = Files.newBufferedWriter(outputPath)) {
            writer.write(content);
        } catch (IOException exception) {
            LOG.log(Level.SEVERE, "The output file could not be created!");
        }
    }

    public void appendText(String path, String content) {
        try {
            Files.write(Paths.get(path), content.getBytes(), StandardOpenOption.APPEND);
        } catch (NoSuchFileException e ) {
            LOG.log(Level.SEVERE, "The file is not existing!");
        } catch (IOException e) {
            LOG.log(Level.SEVERE, "The output file could not be created!");
        }
    }
}
