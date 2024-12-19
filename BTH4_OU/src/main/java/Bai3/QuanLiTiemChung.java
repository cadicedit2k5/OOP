/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class QuanLiTiemChung {
    private List<Vaccine> dsVaccine = new ArrayList<>();
    private List<NguoiDan> dsNguoiDan = new ArrayList<>();
    
    public void themVaccine(Vaccine... vacines) {
        this.dsVaccine.addAll(Arrays.asList(vacines));
    }
    
    public void themNguoiDan(NguoiDan... nguoiDans) {
        this.dsNguoiDan.addAll(Arrays.asList(nguoiDans));
    }

    public void hienThiDSVaccine() {
        this.dsVaccine.forEach(f -> System.out.println(f));
    }

    public void hienThiDsNguoiNuocNgoai() {
        this.dsNguoiDan.forEach(f -> {
            if (f instanceof NguoiNuocNgoai) {
                System.out.println(f);
            }
        });
    }

    public void tiemChung(NguoiDan nguoiDan, Vaccine vaccine, String ngayTiem, String diaDiem) {
        if (vaccine.getSoLuong() > 0) {
            this.dsNguoiDan.stream().filter(f -> Long.compare(nguoiDan.getSoCCCD(), f.getSoCCCD()) == 0).findFirst().get().getTiemChung().tiem(vaccine, ngayTiem, diaDiem);
            vaccine.setSoLuong(vaccine.getSoLuong()-1);
        }
    }
    
    public void dsTiemTren2Mui() {
        this.dsNguoiDan.forEach(f -> {
            if (f.getTiemChung().getSoLanTiem() >= 2) {
                f.thongTinTiem();
            }
        }
        );
    }
    
    public void sortVaccine() {
        this.dsVaccine.sort(Comparator.comparing(Vaccine::getXuatXu).thenComparing( (n1, n2) -> -Integer.compare(n1.getSoLuong(), n2.getSoLuong())));
    }
    public List<Vaccine> getDsVaccine() {
        return this.dsVaccine;
    }

    public void setDsVaccine(List<Vaccine> dsVaccine) {
        this.dsVaccine = dsVaccine;
    }

    public List<NguoiDan> getDsNguoiDan() {
        return this.dsNguoiDan;
    }

    public void setDsNguoiDan(List<NguoiDan> dsNguoiDan) {
        this.dsNguoiDan = dsNguoiDan;
    }
}
