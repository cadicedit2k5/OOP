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
public class Bai1 {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 6, 4, 9, 7, 2 };
        int max = findMax(arr);
        System.out.println("Gia tri lon nhat cua mang = " + max);
    }
    
    public static int findMax(int arr[]) {
        return IntStream.of(arr).max().getAsInt();
    }
}
