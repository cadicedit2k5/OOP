/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class TiemChung {
    private List<Vaccine> vaccine = new ArrayList<>();
    private List<LocalDate> ngayTiem = new ArrayList<>();
    private List<String> diaDiem = new ArrayList<>();
    private int soLanTiem;

    
    public void tiem(Vaccine vaccine, String ngayTiem, String diaDiem) {
        if (this.getSoLanTiem() < 3) {
            this.getVaccine().add(vaccine);
            this.getNgayTiem().add(LocalDate.parse(ngayTiem, CauHinh.FORMATTER));
            this.getDiaDiem().add(diaDiem);
            this.setSoLanTiem(this.getSoLanTiem() + 1);
        }
        else 
            System.out.println("Da tiem du 3 mui");
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < getSoLanTiem(); i++) {
            res += String.format("%s\nNgay Tiem: %s\n", getVaccine().get(i).toString(), getNgayTiem().get(i));
        }
        return res;
    }   

    public List<Vaccine> getVaccine() {
        return vaccine;
    }

    public void setVaccine(List<Vaccine> vaccine) {
        this.vaccine = vaccine;
    }

    public void setNgayTiem(List<LocalDate> ngayTiem) {
        this.ngayTiem = ngayTiem;
    }

    public void setDiaDiem(List<String> diaDiem) {
        this.diaDiem = diaDiem;
    }

    public int getSoLanTiem() {
        return soLanTiem;
    }

    public void setSoLanTiem(int soLanTiem) {
        this.soLanTiem = soLanTiem;
    }

    public List<LocalDate> getNgayTiem() {
        return ngayTiem;
    }

    public List<String> getDiaDiem() {
        return diaDiem;
    }
    
    
}
