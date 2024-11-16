/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7.Ex2;

import java.util.Objects;

/**
 *
 * @author ADMIN
 */
public abstract class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "";
        this.filled = false;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Shape tmp) {
            return tmp.getArea() == this.getArea();
        }
        return (false);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.color);
        hash = 53 * hash + (this.filled ? 1 : 0);
        return hash;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
    
    @Override
    public abstract String toString();
}
