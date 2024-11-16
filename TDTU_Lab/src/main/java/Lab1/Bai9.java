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
public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.print("Nhap vao n = ");
        n = sc.nextInt();
        hailstoneSequence(n);
    }
    public static void hailstoneSequence(int n) {
        while (n != 1) {
            if (n % 2 == 0) {
                System.out.printf("%d is even, so we take n/2: %d\n", n, n/2);
                n /= 2;
            }else {
                System.out.printf("%d is odd, so we take 3*n+1: %d\n", n, 3*n+1);
                n = 3*n + 1;
            }
        }
    }
}
