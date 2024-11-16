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
public class Bai2 {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Bai2 bai2 = new Bai2();
        double ans = bai2.triangleArea();
        System.out.println("Dien tich = " + ans);
    }
    
    public double triangleArea() {
        System.out.print("Do dai day = ");
        double base = sc.nextDouble();
        System.out.print("Chieu cao = ");
        double height = sc.nextDouble();
        
        return 0.5 * base * height;
    }
}
