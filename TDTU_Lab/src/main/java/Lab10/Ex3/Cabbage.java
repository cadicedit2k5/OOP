/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab10.Ex3;

/**
 *
 * @author ADMIN
 */
public class Cabbage implements Vegetable {
    private String type;
    private double weight;
    
    public Cabbage() {
    }

    public Cabbage(String type, double weight) {
        this.type = type;
        this.weight = weight;
    }
    
    @Override
    public String getInfo() {
        return "Cabbage (type = " + this.type + ", weight = " + this.weight + ")";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
