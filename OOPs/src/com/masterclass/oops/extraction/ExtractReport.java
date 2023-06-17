package com.masterclass.oops.extraction;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract public class ExtractReport {

    public abstract Pattern getPattern();

    public abstract String getReportName();

    public abstract String clean(String input);

    private String parse(String path) throws FileNotFoundException {
        String out = "";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        if(scanner.hasNext()) {
            scanner.nextLine();
        } else {
            return "Empty File";
        }
        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            Matcher matcher = getPattern().matcher(nextLine);
            boolean matches = matcher.matches();
            if(matches) {
                out += clean(nextLine) + "\n";
            }
        }
        return out.isEmpty() ? "Empty File" : out;
    }

    public void parseAndSendReport(String path) throws FileNotFoundException {
        System.out.println("Starting Report " + getReportName() + "....");
        String report = parse(path);
        System.out.println(report);
        System.out.println("Sent report " + getReportName());
    }
}
