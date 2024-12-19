/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlitk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author admin
 */
public class QuanLiTaiKhoan {
    private List<TaiKhoan> ds = new ArrayList<>();
    
    public void themTK(TaiKhoan... tk) {
        ds.addAll(Arrays.asList(tk));
    }
    
    public void hienThi() {
        ds.forEach(f -> f.hienThi());
    }

    /**
     * @return the ds
     */
    public List<TaiKhoan> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<TaiKhoan> ds) {
        this.ds = ds;
    }
}
