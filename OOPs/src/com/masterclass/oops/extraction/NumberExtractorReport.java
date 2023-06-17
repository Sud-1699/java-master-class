package com.masterclass.oops.extraction;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberExtractorReport extends ExtractReport {

    private static final Pattern PATTERN = Pattern.compile("^[0-9]*$");

    @Override
    public Pattern getPattern() {
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "Phone Numbers";
    }

    @Override
    public String clean(String input) {
        return input;
    }

    /*
    public String parse(String path) throws FileNotFoundException {
        Pattern pattern = Pattern.compile("^[0-9]*$");
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
            Matcher matcher = pattern.matcher(nextLine);
            boolean matches = matcher.matches();
            if(matches) {
                out += nextLine + "\n";
            }
        }
        return out.isEmpty() ? "Empty File" : out;
    }

    public void parseAndSendReport(String path) throws FileNotFoundException {
        System.out.println("Starting Report ....");
        String report = parse(path);
        System.out.println(report);
        System.out.println("Sent report");
    }
    */
}
