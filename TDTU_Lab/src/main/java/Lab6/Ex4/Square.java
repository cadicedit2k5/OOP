/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6.Ex4;

/**
 *
 * @author ADMIN
 */
public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }
    
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    
    public double getSide() {
        return super.getLength();
    }
    
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }
    
    @Override
    public void setLength(double length) {
        super.setLength(length);
    }
    
    @Override
    public String toString() {
        return "Square [color=" + getColor() + ", filled=" + isFilled() 
                + ", side=" + getSide() + ", area=" + getArea() 
                + ", perimeter=" + getPerimeter() + "]";
    }
}
