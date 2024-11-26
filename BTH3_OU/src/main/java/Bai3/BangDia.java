/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author admin
 */
public class BangDia extends SanPham {
    private double timePlay;

    public BangDia() {
    }

    public BangDia(String name, String discription, String manufacter, double price, double timePlay) {
        super(name, discription, manufacter, price);
        this.timePlay = timePlay;
    }
    
    @Override
    public void nhap() {
        super.nhap();
        System.out.println("So Do dai = ");
        this.setTimePlay(Double.parseDouble(Config.SC.nextLine()));
    }

    @Override
    public String toString() {
        return super.toString() + "\nThoi gian phat: " + this.getTimePlay(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    /**
     * @return the timePlay
     */
    public double getTimePlay() {
        return timePlay;
    }

    /**
     * @param timePlay the timePlay to set
     */
    public void setTimePlay(double timePlay) {
        this.timePlay = timePlay;
    }
}
