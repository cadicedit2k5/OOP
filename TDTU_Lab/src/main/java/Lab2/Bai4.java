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
public class Bai4 {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 6, 4, 9, 7, 2 };
        int cnt = countElements(arr);
        System.out.println("So cac phan tu cua mang = " + cnt);
    }
    
    public static int countElements(int arr[]) {
        return (int)(IntStream.of(arr).count());
    }
}
