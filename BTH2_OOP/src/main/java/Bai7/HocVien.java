/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7;

import java.time.LocalDate;
import java.util.stream.DoubleStream;

/**
 *
 * @author admin
 */
public class HocVien {

    private static int count;
    private int ID = ++count;
    private String name;
    private LocalDate birthDay;
    private double[] score;

    public HocVien(String name, LocalDate birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    public HocVien(String name, String birthDay) {
        this(name, LocalDate.parse(birthDay, Configuration.FORMATTER));
    }
    
    public void enterScore() {
        score = new double[Configuration.SIZE_HV];
        System.out.println("Nhap diem cho hoc vien " + this.name);
        for (int i = 0; i < Configuration.SIZE_HV; i++) {
            System.out.print("Nhap diem mon thu " + (i + 1) + ": ");
            score[i] = Math.random() * 6 + 4;
            System.out.printf("%.1f\n", score[i]);
        }
    }
    
    public double getAverageScore() {
        if (score != null){
            return DoubleStream.of(score).average().getAsDouble();
        }
        return 0;
    }
    
    public boolean isHocBong() {
        if (score == null) return false;
        
        for (var x : score) {
            if (x < 5) return false;
        }
        
        return this.getAverageScore() >= 8.0;
    }
    
    @Override
    public String toString() {
        String s = String.format("%d - %s - %s", this.ID, this.name, this.birthDay.format(Configuration.FORMATTER)) + "\n";
        if (this.score != null) {
            for (var x : score) {
                s += String.format("%.1f", x) + "\t";
            }
        }
        return s;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the birthDay
     */
    public LocalDate getBirthDay() {
        return birthDay;
    }

    /**
     * @param birthDay the birthDay to set
     */
    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

}
