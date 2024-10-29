/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.bth2_oop;

/**
 *
 * @author admin
 */
public class Diem {

    private double x;
    private double y;

    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void hienThi() {
        System.out.printf("(%.1f, %.1f)\t", this.x, this.y);
    }

    public double khoangCach(Diem i) {
        return Math.sqrt(Math.pow(this.x - i.getX(), 2) + Math.pow(this.y - i.getY(), 2));

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
