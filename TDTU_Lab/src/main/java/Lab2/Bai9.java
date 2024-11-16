/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

/**
 *
 * @author ADMIN
 */
public class Bai9 {
    public static int[] divisibleNumbers(int arr[], int k) {
        int cnt = 0;
        for (var x : arr) {
            if (x % k == 0) cnt++;
        }
 
        int [] divisibleArray = new int[cnt];
        int idx = 0;
        for (var x : arr) {
            if (x % k == 0) {
                divisibleArray[idx] = x;
                idx++;
            } 
        }
        return divisibleArray;
    }
}
