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
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int year = sc.nextInt();
        if (isLeapYear(year))
            System.out.printf("Nam %d la nam nhuan.", year);
        else 
            System.out.printf("Nam %d khong la nam nhuan.", year);
    }
    
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || year % 100 != 0 && year % 4 == 0;
    }
}
