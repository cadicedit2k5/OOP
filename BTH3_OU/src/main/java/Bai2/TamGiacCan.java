/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author admin
 */
public class TamGiacCan extends TamGiac {

    public TamGiacCan(double ab, double c) throws java.lang.Exception {
        super(ab, ab, c);
    }

    @Override
    public String toString() {
        return String.format("Tam Giac Can\nDien tich: %.1f", tinhDienTich());
    }
}
