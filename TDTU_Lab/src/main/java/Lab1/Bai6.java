/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

/**
 *
 * @author ADMIN
 */
public class Bai6 {
    public static void main(String[] args) {
        System.out.println("So lon nhat giua 14, 23, 19 la " + minimumBetweenThreeNum(14, 23, 19));
    }
    public static int minimumBetweenThreeNum(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }
}
