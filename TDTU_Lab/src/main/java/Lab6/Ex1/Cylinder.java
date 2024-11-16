/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6.Ex1;

/**
 *
 * @author ADMIN
 */
public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double radius) {
        this();
        super.setRadius(radius);
    }
    
    
    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getVolume() {
        return super.getArea() * this.height;
    }
    
    @Override
    public String toString() {
        return "Cylinder [height=" + height + "]";
    }
}
