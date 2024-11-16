/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

/**
 *
 * @author ADMIN
 */
public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle() {
        this.base = 0.0;
        this.height = 0.0;
    }

    public Triangle(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double getArea() {
        return 0.5 * this.base * this.height;
    }
    
    @Override
    public String toString() {
        return "Triangle[base=" + this.base + ", height=" + this.height + "]";  
    }
}
