/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab10.Ex3;

/**
 *
 * @author ADMIN
 */
public class VegetableFactory {
    public static Vegetable getVegetable(String type) {
        if (type == null) return null;
        return switch (type.toLowerCase()) {
            case "carrot" -> new Carrot();
            case "cabbage" -> new Cabbage();
            case "pumpkin" -> new Pumpkin();
            default -> null;
        };
    }
}
