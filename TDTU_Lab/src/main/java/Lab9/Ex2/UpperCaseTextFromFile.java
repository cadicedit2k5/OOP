/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9.Ex2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ADMIN
 */
public class UpperCaseTextFromFile {
    public static void main(String[] args) {
        try {
            BufferedReader bfRead = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter bfWrite = new BufferedWriter(new FileWriter("output.txt"));
            String text;
            while ((text = bfRead.readLine()) != null) {
                System.out.println(text);
                bfWrite.write(text.toUpperCase());
                bfWrite.write("\n");
            }
            bfWrite.close();
            bfRead.close();
        }catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
    
}
