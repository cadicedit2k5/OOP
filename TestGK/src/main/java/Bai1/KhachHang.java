/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.time.LocalDate;

/**
 *
 * @author ADMIN
 */
public class KhachHang {
    protected static int dem;
    protected String maSo;
    protected String hoTen;
    protected LocalDate ngaySinh;
    protected double soDu;
    
    {
        setMaSo(String.format("KH-%04d", ++dem));
    }

    public KhachHang(String hoTen, LocalDate ngaySinh, double soDu) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.soDu = soDu;
    }
    
    public int tinhTuoi() {
        return LocalDate.now().getYear() - this.ngaySinh.getYear();
    }
    
    public int soSanhSoDu(KhachHang b) {
        if (this.soDu > b.soDu) return 1;
        else if (this.soDu < b.soDu) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Ma So: %s\nTen: %s\nNgay Sinh: %s\nSo du: %.1f",
                this.maSo, this.hoTen, CauHinh.FORMATTER.format(ngaySinh), this.soDu);
    }    
    

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }

    public static int getDem() {
        return dem;
    }

    public static void setDem(int aDem) {
        dem = aDem;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }
    
    
            
}
