/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.bth2_oop;

/**
 *
 * @author admin
 */
public class HinhTron {
    private double radius;
    private Diem center;

    public HinhTron(double radius, Diem center) {
        this.radius = radius;
        this.center = center;
    }
    
    public double chuVi() {
        return 2 * Math.PI * this.radius;
    }
    
    public double dienTich() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    
    public int viTriTuongDoiDiem(Diem d) {
        double kc = this.center.khoangCach(d);
        if (kc > this.radius) return 1;
        else if (kc < this.radius) return -1;
        return 0;
    }
    
    public int viTriTuongDoiHinhTron(HinhTron e) {
        double kc = this.center.khoangCach(e.center);
        double t = this.radius + e.radius;
        if (kc > t) return 1;
        else if (kc < t) return -1;
        return 0;
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * @return the center
     */
    public Diem getCenter() {
        return center;
    }

    /**
     * @param center the center to set
     */
    public void setCenter(Diem center) {
        this.center = center;
    }
    
    
}
