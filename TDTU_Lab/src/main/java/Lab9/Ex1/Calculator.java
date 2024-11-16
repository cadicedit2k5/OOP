/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9.Ex1;

/**
 *
 * @author ADMIN
 */
public class Calculator {

    public double divide(int a, int b) {
        if (b == 0) {
            ArithmeticException ae = new ArithmeticException("divide by zero");
            throw ae;
        } else {
            return (double) a / b;
        }
    }

    boolean isOutRange(int x) {
        return x > 1000 || x < -1000;
    }

    public int multiply(int a, int b) throws NumberOutOfRangeException {
        if (isOutRange(a) || isOutRange(b)) {
            NumberOutOfRangeException n;
            n = new NumberOutOfRangeException("Number is outside the computation");
            throw n;
        }
        return a * b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        try {
            System.out.println(calc.divide(0, 2));
            System.out.println(calc.multiply(-1111, 3));
        } catch (NumberOutOfRangeException | ArithmeticException err) {
            System.err.println("Error: " + err.getMessage());
        }

    }
}
