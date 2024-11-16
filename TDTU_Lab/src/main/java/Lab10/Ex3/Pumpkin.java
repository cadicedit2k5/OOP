/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab10.Ex3;

/**
 *
 * @author ADMIN
 */
public class Pumpkin implements Vegetable {
    private double weight;

    public Pumpkin() {
    }

    public Pumpkin(double weight) {
        this.weight = weight;
    }
    
    @Override
    public String getInfo() {
        return "Pumpkin ( weight = " + this.weight + ")";
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
