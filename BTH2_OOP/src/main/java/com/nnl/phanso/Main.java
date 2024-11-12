/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nnl.phanso;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        PhanSo p1 = new PhanSo(4, 5);
        PhanSo p2 = new PhanSo(4, 8);
        PhanSo p3 = new PhanSo(-8, 12);
        PhanSo p4 = new PhanSo(3, 8);
       
        DsPhanSo ds = new DsPhanSo();
        
        ds.add(p1);
        ds.add(p2, p3, p4);
        ds.add();
        
        System.out.println(ds.sumAll());
        ds.display();
        
        System.out.println("\nXoa === ");
        ds.remove(-1, -2);
        ds.display();   
        
        System.out.println("\nSap xep ========");
        ds.sort();
        ds.display();
    }
}
