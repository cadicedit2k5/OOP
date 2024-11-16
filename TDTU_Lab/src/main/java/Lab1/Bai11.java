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
public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap so = ");
        int n = sc.nextInt();
        System.out.printf("So %d co %d chu so.", n, countDigitNumber(n));
    }
    public static int countDigitNumber(int n) {
        int cnt = 0;
        while (n != 0) {
            n /= 10;
            cnt++;
        }
        
        return cnt;
    }
}
