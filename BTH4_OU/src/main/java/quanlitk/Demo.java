/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlitk;

import java.time.LocalDate;

/**
 *
 * @author admin
 */
public class Demo {

    public static void main(String[] args) {
        TaiKhoan t1 = new TaiKhoanKhongKyHan("NVA", 2000);
        TaiKhoan t2 = new TKKyHan("TVB", 5000, KyHan.MOT_TUAN);
        TaiKhoan t3 = new TKKyHan("ABC", 12000, KyHan.MOT_THANG);
        TaiKhoan t4 = new TKKyHan("TVB", 48000, KyHan.MOT_NAM);
        
        t1.napTien(1000);
        t2.napTien(1000);
        QuanLiTaiKhoan q1 = new QuanLiTaiKhoan();
        q1.themTK(t1, t2, t3, t4);
        q1.hienThi();

    }
}
