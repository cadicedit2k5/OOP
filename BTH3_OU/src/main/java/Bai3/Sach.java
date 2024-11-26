/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author admin
 */
public class Sach extends SanPham {
    private int soTrang;

    public Sach() {
    }

    public Sach(String name, String discription, String manufacter, double price, int soTrang) {
        super(name, discription, manufacter, price);
        this.soTrang = soTrang;
    }
    
    @Override
    public void nhap() {
        super.nhap();
        System.out.println("So trang = ");
        this.setSoTrang(Integer.parseInt(Config.SC.nextLine()));
    }

    @Override
    public String toString() {
        return super.toString() + "\nSo trang : " + this.getSoTrang(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    /**
     * @return the soTrang
     */
    public int getSoTrang() {
        return soTrang;
    }

    /**
     * @param soTrang the soTrang to set
     */
    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    
}
