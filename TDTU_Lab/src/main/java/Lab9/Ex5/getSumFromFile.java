/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9.Ex5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class getSumFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner sc = new Scanner(new File("src/main/resources/input.txt")); 
             PrintWriter w = new PrintWriter(new File("src/main/resources/output.txt"))   ) {
            int sum = 0;
            
            while (sc.hasNextLine()) {
                String[] nums = sc.nextLine().split("\\s+");
                for (var num : nums) {
                    try {
                        sum += Integer.parseInt(num);
                    }catch (NumberFormatException e) {
                        System.out.println("Invalid number: " + num);
                    }
                }
            }
            System.out.println(sum);
            w.println(sum);
        }catch (IOException e) {
            System.out.println("Reading file error: " + e.getMessage());
        }
    }
}
