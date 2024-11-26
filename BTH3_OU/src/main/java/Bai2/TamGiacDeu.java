/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author admin
 */
public class TamGiacDeu extends TamGiacCan {

    public TamGiacDeu(double abc) throws java.lang.Exception {
        super(abc, abc);
    }

    @Override
    public String toString() {
        return String.format("Tam Giac Deu\nDien tich: %.1f", tinhDienTich());

    }

}
