/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7.Ex2;

/**
 *
 * @author ADMIN
 */
public class Square extends Rectangle {

    public Square() {
        super();
    }
    
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    
    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    
    @Override
    public void setLength(double side) {
        super.setLength(side);
    }
    
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }
}
