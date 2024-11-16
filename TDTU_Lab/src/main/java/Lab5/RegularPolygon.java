/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

/**
 *
 * @author ADMIN
 */
public class RegularPolygon {
    private String name;
    private int edgeAmount;
    private double edgeLength;

    public RegularPolygon() {
        this.name = "";
        this.edgeAmount = 3;
        this.edgeLength = 1;
    }

    public RegularPolygon(String name, int edgeAmount, double edgeLength) {
        this.name = name;
        this.edgeAmount = edgeAmount;
        this.edgeLength = edgeLength;
    }
    
    public RegularPolygon(String name, int edgeAmount) {
        this.name = name;
        this.edgeAmount = edgeAmount;
        this.edgeLength = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdgeAmount() {
        return edgeAmount;
    }

    public void setEdgeAmount(int edgeAmount) {
        this.edgeAmount = edgeAmount;
    }

    public double getEdgeLength() {
        return edgeLength;
    }

    public void setEdgeLength(double edgeLength) {
        this.edgeLength = edgeLength;
    }
    
    public String getPolygon() {
        if (this.edgeAmount == 3) return "Triangle";
        else if (this.edgeAmount == 4) return "Quadrangle";
        else if (this.edgeAmount == 5) return "Pentagon";
        else if (this.edgeAmount == 6) return "Hexagon";
        else if (this.edgeAmount > 6) return "Polygon has the number of edges greater than 6";
        else return "It's not a Polygon";
    }
    
    public double getPerimeter() {
        return this.edgeLength * this.edgeAmount;
    }
    
    public double getArea() {
        if (this.edgeAmount > 6) return -1;
        return Math.pow(this.edgeLength, 2) * getA(this.edgeAmount);
    }

    private double getA(int edgeAmount) {
        switch (edgeAmount) {
            case 3 -> {
                return 0.433;
            }
            case 4 -> {
                return 1;
            }
            case 5 -> {
                return 1.72;
            }
            case 6 -> {
                return 2.595;
            }
            default -> throw new AssertionError();
        }
    }
    
    @Override
    public String toString() {
        return this.name + " - " + this.getPolygon() + " - " + this.getArea();
    }
    public static void main(String[] args) {
        RegularPolygon rp = new RegularPolygon("q1", 4);
        System.out.println(rp);
    }
}
