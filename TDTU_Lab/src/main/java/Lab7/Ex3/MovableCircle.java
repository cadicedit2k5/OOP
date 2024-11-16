/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7.Ex3;

/**
 *
 * @author ADMIN
 */
public class MovableCircle implements Movable {
    int radius;
    MoveablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MoveablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    
    @Override
    public String toString() {
        return "Circle[radius=" + this.radius + "]";
    }

    @Override
    public void moveUp() {
        center.y += center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y -= center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x += center.xSpeed;
    }
    
    
}
