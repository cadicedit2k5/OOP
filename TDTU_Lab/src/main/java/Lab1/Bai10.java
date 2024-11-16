/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int sum = Integer.parseInt(s.substring(0, 1)) + Integer.parseInt(s.substring(s.length() - 1, s.length()));
        System.out.println("Tong so dau va cuoi = " + sum);
    }
}
