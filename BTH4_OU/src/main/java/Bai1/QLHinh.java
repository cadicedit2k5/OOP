/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author admin
 */
public class QLHinh {
    List<Hinh> ds = new ArrayList<>();
    
    public void them(Hinh... hinh) {
        this.ds.addAll(Arrays.asList(hinh));
    }
    
    public void hienThi() {
        this.ds.forEach(f -> System.out.print(f));
    }
    
    public static void main(String[] args) {
        Hinh h1 = new HinhChuNhat("Hinh Chu Nhat", 4, 3);
        Hinh h2 = new HinhVuong("Hinh Vuong", 5);
        Hinh h3 = new TamGiac("Tam Giac", 1, 2, 3);
        Hinh h4 = new TamGiacCan("Tam Giac Can", 4, 6);
        Hinh h5 = new TamGiacDeu("Tam Giac Deu", 3);
        Hinh h6 = new Ellipse("Hinh Ellipse", 5, 4);
        Hinh h7 = new HinhTron("Hinh Tron", 3.14);
        
        QLHinh ql  = new QLHinh();
        ql.them(h1, h2, h3, h4, h5, h6, h7);
        ql.hienThi();
        
    }
}
