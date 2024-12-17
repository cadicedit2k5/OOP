/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlitk;

/**
 *
 * @author admin
 */
public class TaiKhoanKhongKyHan extends TaiKhoan {

    public TaiKhoanKhongKyHan(String tenTk, int soTien) {
        super(tenTk, soTien);
    }

    @Override
    public boolean isDaoHan() {
        return true;
    }
    
}
