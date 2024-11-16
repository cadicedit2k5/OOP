/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

import java.util.stream.IntStream;

/**
 *
 * @author ADMIN
 */
public class Bai5 {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 6, 4, 9, 7, 2 };
        int cnt = countPrimeElements(arr);
        System.out.println("So cac phan tu la so nguyen to cua mang = " + cnt);
    }
    
    public static int countPrimeElements(int arr[]) {
        return (int)(IntStream.of(arr).filter(x -> isPrime(x)).count());
    }
    
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
