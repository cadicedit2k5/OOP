/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.bth2_oop;

/**
 *
 * @author admin
 */
public class HinhChuNhat {

    private Diem gocTraiTren;
    private Diem gocPhaiDuoi;

    public HinhChuNhat(Diem gocTraiTren, Diem gocPhaiDuoi) throws Exception {
        if (gocTraiTren.getX() <= gocPhaiDuoi.getX() && gocPhaiDuoi.getY() <= gocTraiTren.getY()) {
            this.gocTraiTren = gocTraiTren;
            this.gocPhaiDuoi = gocPhaiDuoi;
        }else {
            throw new Exception("Invalid data!");
        }
    }

    public double dienTich() {
        double dai = this.gocPhaiDuoi.getX() - this.gocTraiTren.getX();
        double rong = this.gocTraiTren.getY() - this.gocPhaiDuoi.getY();
        return dai * rong;
    }

    public double chuVi() {
        double dai = this.gocPhaiDuoi.getX() - this.gocTraiTren.getX();
        double rong = this.gocTraiTren.getY() - this.gocPhaiDuoi.getY();
        return (dai + rong) * 2;
    }

    public void hienThi() {
        gocTraiTren.hienThi();
        gocPhaiDuoi.hienThi();
        System.out.println("Dien tich hinh chu nhat = " + this.dienTich());
        System.out.println("Chu vi hinh chu nhat = " + this.chuVi());
    }

    /**
     * @return the gocTraiTren
     */
    public Diem getGocTraiTren() {
        return gocTraiTren;
    }

    /**
     * @param gocTraiTren the gocTraiTren to set
     */
    public void setGocTraiTren(Diem gocTraiTren) {
        this.gocTraiTren = gocTraiTren;
    }

    /**
     * @return the gocPhaiDuoi
     */
    public Diem getGocPhaiDuoi() {
        return gocPhaiDuoi;
    }

    /**
     * @param gocPhaiDuoi the gocPhaiDuoi to set
     */
    public void setGocPhaiDuoi(Diem gocPhaiDuoi) {
        this.gocPhaiDuoi = gocPhaiDuoi;
    }

}
