/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8.Ex3;

/**
 *
 * @author ADMIN
 */
public abstract class Student {
    private String sName;
    private double gpa;

    public Student(String sName, double gpa) {
        this.sName = sName;
        this.gpa = gpa;
    }
    
    public abstract String getRank();

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
