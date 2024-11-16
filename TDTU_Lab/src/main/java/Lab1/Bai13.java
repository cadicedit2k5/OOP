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
public class Bai13 {
    public static Bai12 bai12 = new Bai12();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap n = ");
        int n = sc.nextInt();
        
        if (isPalidrome(n))
            System.out.printf("So %d la so Palirome.", n);
        else 
            System.out.printf("So %d khong la so Palidrome.", n);
    }
    
    public static boolean isPalidrome(int n) {
        return n == Bai12.reverseNumber(n);
    }
}
