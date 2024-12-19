/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author ADMIN
 */
public class Vaccine {
    private static int dem;
    private int maVaccine = ++dem;
    private String tenVaccine;
    private String xuatXu;
    private int soLuong;

    public Vaccine(String tenVaccine, String xuatXu, int soLuong) {
        this.tenVaccine = tenVaccine;
        this.xuatXu = xuatXu;
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return String.format("Ma Vaccine: %d\nTen Vaccine: %s\nXuat xu: %s\nSoluong: %d", 
                this.maVaccine, this.tenVaccine, this.xuatXu, this.soLuong);
    }
    

    public static int getDem() {
        return dem;
    }

    public static void setDem(int aDem) {
        dem = aDem;
    }

    public int getMaVaccine() {
        return maVaccine;
    }

    public void setMaVaccine(int maVaccine) {
        this.maVaccine = maVaccine;
    }

    public String getTenVaccine() {
        return tenVaccine;
    }

    public void setTenVaccine(String tenVaccine) {
        this.tenVaccine = tenVaccine;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
