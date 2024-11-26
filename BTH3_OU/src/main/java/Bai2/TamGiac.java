/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author admin
 */
public class TamGiac {
    private double a;
    private double b;
    private double c;

    public TamGiac(double a, double b, double c) throws java.lang.Exception {
        if (a < b + c && b < a + c && c < a + b) {
            this.a = a;
            this.b = b;
            this.c = c;
        }else 
            throw Exception("Invalid data!");
    }
    
    public double tinhDienTich() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p *(p-a) * (p-b) * (p-c));
    }

    @Override
    public String toString() {
        return String.format("Hinh Tam Giac\nDien tich: %.1f", tinhDienTich());
    }

    /**
     * @return the a
     */
    public double getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public double getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public double getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(double c) {
        this.c = c;
    }

    private Exception Exception(String invalid_data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
