/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8.Ex4;

import java.util.Vector;

/**
 *
 * @author ADMIN
 */
public class Main {
    
    public static Vector<Long> f(Vector<Integer> X) {
        Vector<Long> y = new Vector<>(X.size());
        for (var x : X) {
            y.add((long) (2 * x * x + 1));
        }
        
        return y;
    }
    public static void main(String[] args) {
        int n = 5;
        Vector<Integer> x = new Vector<>(n);
        
        for (int i = 0; i < n; i++) {
            int value = (int) (Math.random() * 100);
            System.out.print(value + " ");
            x.add(value);
        }
        System.out.println();
        Vector<Long> fX = f(x);
        for (var y : fX) {
            System.out.print(y + " ");
        }
    }
}
