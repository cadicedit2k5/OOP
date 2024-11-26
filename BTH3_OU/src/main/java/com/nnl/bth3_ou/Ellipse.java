/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nnl.bth3_ou;

/**
 *
 * @author admin
 */
public class Ellipse {
    private double bkTruclon;
    private double bkTrucNho;

    public Ellipse(double bkTruclon, double bkTrucNho) {
        this.bkTruclon = bkTruclon;
        this.bkTrucNho = bkTrucNho;
    }
    
    public double tinhDienTich() {
        return Math.PI * this.bkTrucNho * this.bkTruclon;
    }
    
    public double tinhChuVi() {
        return 2 * Math.PI * Math.sqrt((bkTrucNho * bkTrucNho + bkTruclon * bkTruclon) / 2);
    }

    /**
     * @return the bkTruclon
     */
    public double getBkTruclon() {
        return bkTruclon;
    }

    /**
     * @param bkTruclon the bkTruclon to set
     */
    public void setBkTruclon(double bkTruclon) {
        this.bkTruclon = bkTruclon;
    }

    /**
     * @return the bkTrucNho
     */
    public double getBkTrucNho() {
        return bkTrucNho;
    }

    /**
     * @param bkTrucNho the bkTrucNho to set
     */
    public void setBkTrucNho(double bkTrucNho) {
        this.bkTrucNho = bkTrucNho;
    }
    
    @Override
    public String toString() {
        return String.format("Hinh Ellipse\nDien tich: %.1f\nChu vi: %.1f", tinhDienTich(), tinhChuVi());
    }
}
