/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

import java.time.LocalDate;

/**
 *
 * @author admin
 */
public class TaiKhoan {
    private static int dem = 1;
    private String soTk = laySoTK();
    private String tenTk;
    private String soDT;
    private String email;
    private double soTien;
    private LocalDate ngayTaoTk;
    private boolean trangThaiTk;

    public TaiKhoan() {
        
    }

    public TaiKhoan(String tenTk, String soDT, String email, double soTien, LocalDate ngayTaoTk, boolean trangThaiTk) {
        this.tenTk = tenTk;
        this.soDT = soDT;
        this.email = email;
        this.soTien = soTien;
        this.ngayTaoTk = ngayTaoTk;
        this.trangThaiTk = trangThaiTk;
    }
    
    
    
    public String laySoTK() {
        String soTT = String.valueOf(dem);
        String ans = "";
        for (int i = 6; i > soTT.length(); i++) {
            ans += "0";
        }
        dem++;
        return ans + soTT;
    }

    /**
     * @return the soTk
     */
    public String getSoTk() {
        return soTk;
    }

    /**
     * @param soTk the soTk to set
     */
    public void setSoTk(String soTk) {
        this.soTk = soTk;
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
     * @return the soDT
     */
    public String getSoDT() {
        return soDT;
    }

    /**
     * @param soDT the soDT to set
     */
    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the soTien
     */
    public double getSoTien() {
        return soTien;
    }

    /**
     * @param soTien the soTien to set
     */
    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    /**
     * @return the ngayTaoTk
     */
    public LocalDate getNgayTaoTk() {
        return ngayTaoTk;
    }

    /**
     * @param ngayTaoTk the ngayTaoTk to set
     */
    public void setNgayTaoTk(LocalDate ngayTaoTk) {
        this.ngayTaoTk = ngayTaoTk;
    }

    /**
     * @return the trangThaiTk
     */
    public boolean isTrangThaiTk() {
        return trangThaiTk;
    }

    /**
     * @param trangThaiTk the trangThaiTk to set
     */
    public void setTrangThaiTk(boolean trangThaiTk) {
        this.trangThaiTk = trangThaiTk;
    }
    
    
    
}
