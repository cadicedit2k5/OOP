/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8.Ex2;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    @Override
    public String toString() {
        return "Point(" + this.x + ", " + this.y + ")";
    }
    
    public double distanceFromOrigin() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
    
     public static void main(String[] args) {
        // Creating an ArrayList of Point objects
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(0.5, 0.5));
        points.add(new Point(1.0, 1.0));
        points.add(new Point(-0.5, 0.5));
        points.add(new Point(0.3, 0.9));
        points.add(new Point(1.2, 0.8));

        // Center of circle is O (0,0) and radius is 1
        double radius = 1.0;

        // Find and display points within the circle
        System.out.println("Points inside the circle with radius " + radius + ":");
        for (Point point : points) {
            if (point.distanceFromOrigin() <= radius) {
                System.out.println(point);
            }
        }
    }
}
