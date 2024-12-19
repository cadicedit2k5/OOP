/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.time.LocalDate;

/**
 *
 * @author ADMIN
 */
public class NguoiDan {
    private long soCCCD;
    private String hoTen;
    private String gioiTinh;
    private String soDT;
    private LocalDate ngaySinh;
    private TiemChung tiemChung = new TiemChung();

    public NguoiDan(long soCCCD, String hoTen, String gioiTinh, String soDT, String ngaySinh) {
        this.soCCCD = soCCCD;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.soDT = soDT;
        this.ngaySinh = LocalDate.parse(ngaySinh, CauHinh.FORMATTER);
    }
    
    public void thongTinTiem() {
        System.out.printf("So CCCD: %d\nHo Ten: %s\n%s", this.soCCCD, this.hoTen, this.tiemChung.toString());
    }
    
    public boolean isDuDKMuiTiepTheo() {
        LocalDate ngayTiemCuoiCung = this.tiemChung.getNgayTiem().getLast();
        int diffYear = LocalDate.now().getYear() - ngayTiemCuoiCung.getYear();
        int diffMonth = LocalDate.now().getMonthValue()- ngayTiemCuoiCung.getMonthValue();

        return diffYear * 12 + diffMonth >= 3;
    }

    @Override
    public String toString() {
        return String.format("So CCCD: %d\nHo Ten: %s\nGioi Tinh: %s\nSo DT: %s\nNgay Sinh: %s", this.getSoCCCD(), this.getHoTen(), this.getGioiTinh(), this.getSoDT(), CauHinh.FORMATTER.format(getNgaySinh()));
    }

    @Override
    public boolean equals(Object obj) {
        NguoiDan n = (NguoiDan) obj;
        return this.getSoCCCD() == n.getSoCCCD();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (this.getSoCCCD() ^ (this.getSoCCCD() >>> 32));
        return hash;
    }

    public long getSoCCCD() {
        return soCCCD;
    }

    public void setSoCCCD(long soCCCD) {
        this.soCCCD = soCCCD;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public TiemChung getTiemChung() {
        return tiemChung;
    }

    public void setTiemChung(TiemChung tiemChung) {
        this.tiemChung = tiemChung;
    }
    
    
}
