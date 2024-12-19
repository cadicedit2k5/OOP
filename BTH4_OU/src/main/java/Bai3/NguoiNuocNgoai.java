/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author ADMIN
 */
public class NguoiNuocNgoai extends NguoiDan {
    private String soHoChieu;
    private String quocTich;

    public NguoiNuocNgoai(long soCCCD, String hoTen, String gioiTinh, String soDT, String ngaySinh, String soHoChieu, String quocTich) {
        super(soCCCD, hoTen, gioiTinh, soDT, ngaySinh);
        this.soHoChieu = soHoChieu;
        this.quocTich = quocTich;
    }

    @Override
    public String toString() {
        return String.format("%s\nSo Ho Chieu: %s\nQuoc Tich: %s", super.toString(), soHoChieu, quocTich);
    }

    public String getSoHoChieu() {
        return soHoChieu;
    }

    public void setSoHoChieu(String soHoChieu) {
        this.soHoChieu = soHoChieu;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }
}
