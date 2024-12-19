/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.io.FileNotFoundException;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        QLKH ql = new QLKH("src/main/resources/KhachHang.txt");
        
        System.out.println(ql);
        
        System.out.println("Tim Khach hang");
        ql.timKiem("Mai");
        
        System.out.println("========================");
        System.out.println("Sap Xep");
        ql.sapXep();
        System.out.println(ql);
        
        System.out.println("Xuat Ket Qua ============= ");
        ql.xuatKq();
    }
}
