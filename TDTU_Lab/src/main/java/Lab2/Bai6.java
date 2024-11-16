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
public class Bai6 {
    public static int find(int arr[], int k) {
        return IntStream.of(arr).filter(x -> x == k).findFirst().orElse(-1);
    }
}
