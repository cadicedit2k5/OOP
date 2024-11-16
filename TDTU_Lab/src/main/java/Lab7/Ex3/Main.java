/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7.Ex3;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(0, 0, 1, 1, 5);
        MoveablePoint center = circle.center;
        System.out.println("Initial center point: " + center);

        circle.moveRight();
        circle.moveUp();

        System.out.println("Updated center point: " + circle.center);
    }
}
