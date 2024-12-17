/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package quanlitk;

import java.time.LocalDate;

/**
 *
 * @author admin
 */
public enum KyHan {
    MOT_TUAN(7) {
        @Override
        public LocalDate tinhKyHan(LocalDate start) {
            return start.plusDays(this.khoangThoiGian);
        }
    },
    MOT_THANG(1) {
        @Override
        public LocalDate tinhKyHan(LocalDate start) {
            return start.plusMonths(this.khoangThoiGian);
        }
    },
    MOT_NAM(1) {
        @Override
        public LocalDate tinhKyHan(LocalDate start) {
            return start.plusYears(this.khoangThoiGian);
        }
    };
    
    protected int khoangThoiGian;

    private KyHan(int khoangThoiGian) {
        this.khoangThoiGian = khoangThoiGian;
    }

    public abstract LocalDate tinhKyHan(LocalDate start);
    
}
