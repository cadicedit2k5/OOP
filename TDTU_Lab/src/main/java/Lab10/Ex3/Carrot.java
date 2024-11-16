/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab10.Ex3;

/**
 *
 * @author ADMIN
 */
public class Carrot implements Vegetable{
    private String type;

    public Carrot() {
    }

    public Carrot(String type) {
        this.type = type;
    }
    
    @Override
    public String getInfo() {
        return "Carrot (type = " + this.type + ")";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
