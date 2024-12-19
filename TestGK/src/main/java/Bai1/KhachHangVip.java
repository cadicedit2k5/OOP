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
public class KhachHangVip extends KhachHang {
    private LocalDate ngayHetHan;

    public KhachHangVip(String hoTen, LocalDate ngaySinh, double soDu, LocalDate ngayHetHan) {
        super(hoTen, ngaySinh, soDu);
        this.ngayHetHan = ngayHetHan;
    }

    @Override
    public String toString() {
        return String.format("%s\nNgay het han: %s", super.toString(), CauHinh.FORMATTER.format(this.ngayHetHan));
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }
}
