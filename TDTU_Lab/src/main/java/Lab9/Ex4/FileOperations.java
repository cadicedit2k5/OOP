/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9.Ex4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class FileOperations {

    // Get specific files by extensions from a given folder.
    public static ArrayList<File> getSpecificFilesByExtentions(String folderPath, String extention) {
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(extention);
            }
        };
        File folder = new File(folderPath);
        ArrayList<File> filesWithExtention = new ArrayList<>();
        if (folder.isDirectory() || folder.exists()) {
            File[] files = folder.listFiles(filter);
            if (files != null) {
                filesWithExtention.addAll(Arrays.asList(files));
            }
        } else {
            System.out.println("The provided path is not a valid directory.");
        }
        return filesWithExtention;
    }

    //Check if a file or directory specified by pathname exists or not
    public static boolean isExtists(String path) {
        File f = new File(path);
        return f.exists();
    }

    // Check if the given pathname is a directory or a file
    public static void checkTypePath(String path) {
        File f = new File(path);
        if (f.exists()) {
            if (f.isDirectory()) {
                System.out.println(path + " is a directory.");
            } else if (f.isFile()) {
                System.out.println(path + " is a File.");
            }
        } else {
            System.out.println(path + " doesn't exists.");
        }
    }

    //Append text to an existing file.
    public static void appendText(String path, String text) {
        try {
            PrintWriter w = new PrintWriter(new File(path));
            w.append(text);
            w.append("\n");
            w.close();
        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }

    // Find the longest word in a text file
    public static String findLongestWord(String path) throws FileNotFoundException {
        try (Scanner r = new Scanner(new File(path))) {
            String word;
            String longest = "";
            while ((word = r.next()) != null) {
                longest = word.length() > longest.length() ? word : longest;
            }

            return longest;
        }
    }

    public static void main(String[] args) {
        
        String folderPath = "src/main/resources";  // Set folder path here
        String filePath = "src/main/resources/input.txt";  // Set file path here
        String textToAppend = "Appended text.";

        // Test: Get specific files by extension
        System.out.println("Getting files with .txt extension:");
        List<File> txtFiles = getSpecificFilesByExtentions(folderPath, ".txt");
        for (File file : txtFiles) {
            System.out.println(file.getName());
        }

        // Test: Check if file or directory exists
        String pathToCheck = "your-chec"
                + "k-path"; // Set path to check
        System.out.println("Does the path exist? " + isExtists(pathToCheck));

        // Test: Check if it's a file or directory
        checkTypePath(pathToCheck);

        // Test: Append text to an existing file
        appendText(filePath, textToAppend);
        System.out.println("Text appended to " + filePath);

        // Test: Find the longest word in a text file
//        String longestWord = findLongestWord(filePath);
//        System.out.println("Longest word in the file: " + longestWord);
    }
}
