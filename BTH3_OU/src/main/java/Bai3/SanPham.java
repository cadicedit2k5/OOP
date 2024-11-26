/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author admin
 */
public abstract class SanPham {

    private static int dem;
    private int id = ++dem;
    private String name;
    private String discription;
    private String manufacter;
    private double price;

    public SanPham() {
    }

    public SanPham(String name, String discription, String manufacter, double price) {
        this.name = name;
        this.discription = discription;
        this.manufacter = manufacter;
        this.price = price;
    }

    public boolean equals(SanPham p) {
        return this.getId() == p.getId();
    }

    public int soSanh(SanPham p) {
        if (this.getPrice() > p.getPrice()) {
            return 1;
        } else if (this.getPrice() == p.getPrice()) {
            return 0;
        }
        return -1;
    }

    public void nhap() {
        System.out.println("Nhap ten = ");
        this.name = Config.SC.nextLine();
        System.out.println("Nhap mo ta: ");
        this.discription = Config.SC.nextLine();
        System.out.println("Nha san xuat = ");
        this.manufacter = Config.SC.nextLine();
        System.out.println("Gia = ");
        this.price = Double.parseDouble(Config.SC.nextLine());
    }

    public boolean contain(String key) {
        return this.name.contains(key) || this.manufacter.contains(key) || this.discription.contains(key);
    }

    @Override
    public String toString() {
        return "ID: " + this.getId()
                + "\nTen San Pham: " + this.getName()
                + "\nMo ta san pham: " + this.getDiscription()
                + "\nNha san xuat: " + this.getManufacter()
                + "\nGia ban: " + this.getPrice();
    }

    /**
     * @return the dem
     */
    public static int getDem() {
        return dem;
    }

    /**
     * @param aDem the dem to set
     */
    public static void setDem(int aDem) {
        dem = aDem;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the discription
     */
    public String getDiscription() {
        return discription;
    }

    /**
     * @param discription the discription to set
     */
    public void setDiscription(String discription) {
        this.discription = discription;
    }

    /**
     * @return the manufacter
     */
    public String getManufacter() {
        return manufacter;
    }

    /**
     * @param manufacter the manufacter to set
     */
    public void setManufacter(String manufacter) {
        this.manufacter = manufacter;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
