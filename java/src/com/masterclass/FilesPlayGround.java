package com.masterclass;

import java.io.*;
import java.util.Scanner;

public class FilesPlayGround {
    public static void main(String[] args) {
        //Create new file if not present
        File file = createFile("java/src/foo.txt");

        //Write content into file
        writeToFile(file, true);

        //Read Content from file
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void writeToFile(File file, boolean append) {
        //Try with resources where close and flush is auto
        try(
                FileWriter fileWriter = new FileWriter(file, append);
                PrintWriter printWriter = new PrintWriter(fileWriter);
                ) {
            printWriter.println("Try with resources");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //Try without resources
        /*try {
            FileWriter fileWriter = new FileWriter(file, append);

            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Hello");
            printWriter.println("World");
            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }*/
    }

    private static File createFile(String path) {
        try {
            File file = new File(path);
            if(!file.exists()) {
                file.createNewFile();
            }
            return file;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new IllegalStateException(e);
        }
    }
}
