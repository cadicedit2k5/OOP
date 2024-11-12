/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7;

import java.io.FileNotFoundException;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        HocVien h1 = new HocVien("Nguyen Van A", "01/02/2004");
        HocVien h2 = new HocVien("Nguyen Van B", "14/02/2002");
        HocVien h3 = new HocVien("Nguyen Van C", "05/06/2000");
        HocVien h4 = new HocVien("Nguyen Van F", "04/12/1999");
        
        QuanLyHocVien ds = new QuanLyHocVien();
        ds.add(h1, h2, h3);
        ds.add("src/main/resources/hocvien.txt");
        ds.enterScores();
        
        ds.display();
        System.out.println("Tim kiem) ====");
        System.out.println(ds.find("Nguyen Van Mach"));
        
        System.out.println("Tim kiem co hb ====");
        ds.find().forEach(h -> System.out.println(h));
        ds.xuatDsHB("src/main/resources/hocbong.txt");
        System.out.println("Sap xep ===");
        ds.sort();
        ds.display();
        
    }
}
