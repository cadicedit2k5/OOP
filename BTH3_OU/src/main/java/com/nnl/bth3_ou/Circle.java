/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nnl.bth3_ou;

/**
 *
 * @author admin
 */
public class Circle extends Ellipse
{

    public Circle(double bk) {
        super(bk, bk);
    }

    @Override
    public String toString() {
        return String.format("Hinh Circle\nDien tich: %.1f\nChu vi: %.1f", tinhDienTich(), tinhChuVi());
    }
}
