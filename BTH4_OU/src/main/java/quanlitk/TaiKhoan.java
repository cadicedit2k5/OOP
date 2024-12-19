/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlitk;

/**
 *
 * @author admin
 */
public abstract class TaiKhoan {
    private static int dem;
    private String soTk;
    private String tenTk;
    private int soTien;
    {
        soTk = String.format("%06d", ++dem);
    }

    public TaiKhoan(String tenTk, int soTien) {
        this.tenTk = tenTk;
        this.soTien = soTien;
    }
    
    public abstract boolean isDaoHan();
    
    public void napTien(int tien) {
        if (isDaoHan() == true)
            this.soTien += tien;
    }
    
    public void rutTien(int tien) {
        if (this.soTien >= tien && isDaoHan() == true)
            this.soTien -= tien;
    }
    public void hienThi() {
        System.out.println(String.format("So TK: %s\nTen TK: %s\nSo Tien: %d", soTk, tenTk, soTien));
    }
    /**
     * @return the soTk
     */
    public String getSoTk() {
        return soTk;
    }

    /**
     * @return the tenTk
     */
    public String getTenTk() {
        return tenTk;
    }

    /**
     * @param tenTk the tenTk to set
     */
    public void setTenTk(String tenTk) {
        this.tenTk = tenTk;
    }

    /**
     * @return the soTien
     */
    public int getSoTien() {
        return soTien;
    }

    /**
     * @param soTien the soTien to set
     */
    public void setSoTien(int soTien) {
        this.soTien = soTien;
    }

    
}
