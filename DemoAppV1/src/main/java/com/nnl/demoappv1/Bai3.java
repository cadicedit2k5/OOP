/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nnl.demoappv1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai3 {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(System.in);
//        //Bai 3a
//        String email = sc.nextLine();
//        
//        String emailAdressName = email.substring(0, email.indexOf("@"));
//        
//        System.out.println(emailAdressName);
//        
//        //Bai 3b
//        String str3b = sc.nextLine();
//        
//        int cntUpper = 0;
//        int cntLower = 0;
//        
//        for (int i = 0; i < str3b.length(); i++) {
//            if (Character.isLowerCase(str3b.charAt(i))) cntLower++;
//            else if (Character.isUpperCase(str3b.charAt(i))) cntUpper++;
//        }
//        
//        System.out.println(cntLower);
//        System.out.println(cntUpper);
//        
//        
        //Bai3c
        File f = new File("src/main/resources/input.txt");
        File fo = new File("src/main/resources/output.txt");
        
        try (Scanner sc = new Scanner(f); 
             PrintWriter w = new PrintWriter(fo)) {
            
            String s = sc.nextLine();
            s = s.replaceAll("\\{file\\}", "Tap tin");
            
            w.println(s);
        }
        
        //Bai 3d
        
        String s = "   Java  ;, is, Simple  ,  ";
        
        s = s.trim();
        String[] a = s.split("[\\s,;]+");
        String daiNhat = a[0];
        
        for (int i = 1; i < a.length; i++) {
            if (a[i].length() > daiNhat.length()) {
                daiNhat = a[i];
            }
        }
        System.out.println("So tu trong xau = " + a.length);
        System.out.println(daiNhat);
        
        //Bai  3e
        String s3e = "   Java is   siMPle  ";
        s3e = s3e.trim();
        String[] b = s3e.split("\\s+");
        
        String kq = "";
        
        for (int i = 0; i < b.length; i++) {
            kq += b[i].substring(0, 1).toUpperCase() + b[i].substring(1).toLowerCase() + " ";
        }
        
        System.out.println(kq.trim());
    }
}
