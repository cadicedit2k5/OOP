/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6.Ex4;

/**
 *
 * @author ADMIN
 */
public class Circle extends Shape{
    private double radius;

    public Circle() {
        super();
        this.radius = 1.0;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
    
    @Override
    public String toString() {
        return "Circle [color=" + super.getColor() + ", filled=" + 
                super.isFilled() + ", radius=" + radius + ", area=" + getArea() + "]";
    }
}
