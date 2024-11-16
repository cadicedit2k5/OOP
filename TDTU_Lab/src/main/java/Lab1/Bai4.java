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
public class Bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        double ans;
        System.out.println("1) Farenheit to Celsius.");
        System.out.println("2) Celsius to Farenheit.");
        System.out.print("Nhap lua chon: ");
        int op = sc.nextInt();
        switch (op) {
            case 1 -> {
                System.out.print("Nhap so Farenheit = ");
                x = sc.nextDouble();
                ans = farenheitToCelsius(x);
                System.out.println("Ket qua = " + ans);
            }
            case 2 -> {
                System.out.print("Nhap so Celsius = ");
                x = sc.nextDouble();
                ans = celsiusToFarenheit(x);
                System.out.println("Ket qua = " + ans);
            }
            default ->
                System.out.println("Lua chon khong hop le!");
        }
    }

    public static double farenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToFarenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
