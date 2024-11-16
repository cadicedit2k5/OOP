/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

/**
 *
 * @author ADMIN
 */
public class Bai8 {
    public static void main(String[] args) {
        //Tu test
    }
    
    public static int nSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    
    public static int nMulti(int n) {
        int mul = 1;
        for (int i = 2; i <= n; i++) {
            mul *= i; 
        }
        return mul;
    }
    
    public static int sumOfPowerOfTwo(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += Math.pow(2, i);
        }
        return sum;
    }
    
    public static double sumOfEvenReciprocals(int n) {
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum += 1.0/(2 * i);
        }
        return sum;
    }
    public static int sumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }
}
