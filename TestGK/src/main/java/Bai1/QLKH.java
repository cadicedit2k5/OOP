/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QLKH {
    private List<KhachHang> ds = new ArrayList<>();

    public QLKH(String path) throws FileNotFoundException {
        try(Scanner sc = new Scanner(new File(path))) {
            //Skip hai dong dau
            sc.nextLine();
            sc.nextLine();
            
            while (sc.hasNext()) {
                String[] line = sc.nextLine().strip().split(", ");
                if (line.length == 3) {
                    this.ds.add(new KhachHang(line[0], LocalDate.parse(line[1], CauHinh.FORMATTER), Double.parseDouble(line[2])));
                }else 
                    this.ds.add(new KhachHangVip(line[0], LocalDate.parse(line[1], CauHinh.FORMATTER), Double.parseDouble(line[2]), LocalDate.parse(line[3], CauHinh.FORMATTER)));
            }
        }
    }
    
    public void timKiem(String hoTen) {
        System.out.println(this.ds.stream().filter(f -> f.getHoTen().contains(hoTen)).findFirst().get());
    }
    
    public void sapXep() {
        this.ds.sort(Comparator.comparing(KhachHang::getSoDu).reversed());
    }

    public void xuatKq() throws FileNotFoundException  {
        sapXep();
        try (PrintWriter f = new PrintWriter(new File("src/main/resources/Top10.txt"))) {
            int n = this.ds.size();
            for (int i = n - 1; i >= n - 10; i--) {
                f.write(this.ds.get(i).toString() + "\n");
            }
        }
    }
    
    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < this.ds.size(); i++) {
            res = res + this.ds.get(i).toString() + "\n";
        }
        return res;
    }

    public List<KhachHang> getDs() {
        return ds;
    }

    public void setDs(List<KhachHang> ds) {
        this.ds = ds;
    }
}
