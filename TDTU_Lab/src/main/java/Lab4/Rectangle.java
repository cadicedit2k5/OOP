/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

/**
 *
 * @author ADMIN
 */
public class Rectangle {
    private float width;
    private float length;

    public Rectangle() {
        this.width = 1.0f;
        this.length = 1.0f;
    }

    public Rectangle(float width, float length) {
        this.width = width;
        this.length = length;
    }
    
    

    /**
     * @return the width
     */
    public float getWidth() {
        return width;
    }

    /**
     * @return the length
     */
    public float getLength() {
        return length;
    }
    
    public float getArea() {
        return this.width * this.length;
    }
    
    public float getPerimeter() {
        return 2 * (this.width + this.length);
    }
    
    /**
     * @param width the width to set
     */
    public void setWidth(float width) {
        this.width = width;
    }

    /**
     * @param length the length to set
     */
    public void setLength(float length) {
        this.length = length;
    }
    
    @Override
    public String toString() {
        return "Rectangle[ width: " + width
                + ", length: " + length + "]";
    }
}
