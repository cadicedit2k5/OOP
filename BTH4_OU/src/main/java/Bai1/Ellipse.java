/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author admin
 */
public class Ellipse extends Hinh {

    private double trucLon;
    private double trucBe;

    public Ellipse(String ten, double trucLon, double trucBe){
        super(ten);
        this.trucLon = trucLon;
        this.trucBe = trucBe;
    }

    @Override
    public double tinhDienTich() {
        return this.getTrucLon() * this.getTrucBe() * Math.PI;
    }

    @Override
    public double tinhChuVi() {
        return (this.trucBe + this.trucLon) * Math.PI;
    }

    /**
     * @return the trucLon
     */
    public double getTrucLon() {
        return trucLon;
    }

    /**
     * @param trucLon the trucLon to set
     */
    public void setTrucLon(double trucLon) {
        this.trucLon = trucLon;
    }

    /**
     * @return the trucBe
     */
    public double getTrucBe() {
        return trucBe;
    }

    /**
     * @param trucBe the trucBe to set
     */
    public void setTrucBe(double trucBe) {
        this.trucBe = trucBe;
    }

}
