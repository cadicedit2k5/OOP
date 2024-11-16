/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

import static java.util.Arrays.sort;

/**
 *
 * @author ADMIN
 */
public class Bai10 {
    public static int thirdLargestElement(int arr[]) {
        sort(arr);
        return arr[arr.length - 3];
    }
}
