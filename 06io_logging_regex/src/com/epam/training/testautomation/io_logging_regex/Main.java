package com.epam.training.testautomation.io_logging_regex;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final Logger LOG = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        FileHandler task = new FileHandler();
        String fileContent = task.readFromFile("input.txt");
        task.writeToFile("output.txt", fileContent);

        Pattern p = Pattern.compile("[a-zA-Z]");
        Matcher m = p.matcher(fileContent);

        StringBuilder message = new StringBuilder();
        while (m.find()) {
            message.append(m.group());
        }

        String stringifiedMessage = message.toString();
        task.appendText("output.txt", stringifiedMessage);

        LOG.log(Level.INFO, message.toString());
    }
}
