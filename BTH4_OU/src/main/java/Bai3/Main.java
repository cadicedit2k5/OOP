/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.time.LocalDate;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
        NguoiDan n1 = new NguoiDan(1, "NVA", "Nam", "0123", "01/01/2005");
        NguoiDan n2 = new NguoiDan(2, "TTB", "Nu", "0114", "08/11/2000");
        NguoiDan n3 = new NguoiNuocNgoai(3, "Thomson", "Nam", "0213", "01/02/1997", "123", "England");
        NguoiDan n4 = new NguoiDan(4, "NND", "Nam", "0623", "02/10/2003");
        NguoiDan n5 = new NguoiNuocNgoai(5, "Kely", "Nu", "0613", "18/04/2004", "234", "USA");
        NguoiDan n6 = new NguoiDan(6, "TTF", "Nu", "0153", "01/02/1999");

        Vaccine v1 = new Vaccine("Pfizer", "USA", 100);
        Vaccine v2 = new Vaccine("AstraZeneca", "UK", 80);
        Vaccine v3 = new Vaccine("Sinovac", "China", 50);
        Vaccine v4 = new Vaccine("Homozito", "China", 70);

        QuanLiTiemChung ql = new QuanLiTiemChung();
        ql.themNguoiDan(n1, n2, n3, n4, n5, n6);
        ql.themVaccine(v1, v2, v3, v4);

        System.out.println("Cau a ---------");
        ql.hienThiDSVaccine();

        System.out.println("Cau b ---------");
        ql.hienThiDsNguoiNuocNgoai();

        System.out.println("Cau c ---------");
        ql.tiemChung(n1, v1, "02/03/2022", "Ho Chi Minh");
        ql.tiemChung(n1, v2, "02/09/2022", "Ho Chi Minh");
        ql.tiemChung(n2, v2, "02/03/2022", "Ha Noi");

        System.out.println("Cau d ---------");
        ql.dsTiemTren2Mui();
        
        System.out.println("Cau e ---------");
        ql.sortVaccine();
        ql.hienThiDSVaccine();
    }
}
