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
public class Bai3 {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 6, 4, 9, 7, 2 };
        int sum = getSum(arr);
        System.out.println("Tong cac phan tu cua mang = " + sum);
    }
    
    public static int getSum(int arr[]) {
        return IntStream.of(arr).filter(x -> x % 2 == 0).sum();
    }
}
