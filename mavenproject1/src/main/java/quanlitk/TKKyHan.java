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
public class TKKyHan extends TaiKhoan{
    private KyHan kyHan;
    private LocalDate ngayDaoHan;

    public TKKyHan(String tenTk, int soTien, KyHan kyHan) {
        super(tenTk, soTien);
        this.kyHan = kyHan;
        this.ngayDaoHan = kyHan.tinhKyHan(LocalDate.now());
    }

    @Override
    public void hienThi() {
        super.hienThi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println(String.format("Ky Han: %s\nNgay Dap Han: %s\n", this.kyHan, this.ngayDaoHan));
    }

    @Override
    public boolean isDaoHan() {
        return this.ngayDaoHan.equals(LocalDate.now());
    }
}
