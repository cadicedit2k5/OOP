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
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a = ");
        int a = sc.nextInt();
        System.out.print("Nhap b = ");
        int b = sc.nextInt();
        int ans = remainderOfDivision(a, b);
        System.out.println("Phan du cua a / b = " + ans);
    }
    
    public static int remainderOfDivision(int a, int b) {
        return a % b;
    }
    
}
