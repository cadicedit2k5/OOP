/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6.Ex4;

/**
 *
 * @author ADMIN
 */
public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea() {
        return this.width * this.length;
    }
    
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }
    
    @Override
    public String toString() {
        return "Rectangle [color=" + super.getColor() + ", filled=" 
                + super.isFilled() + ", width=" + width + ", length=" + length 
                + ", area=" + getArea() + ", perimeter=" + getPerimeter() + "]";
    }
}
