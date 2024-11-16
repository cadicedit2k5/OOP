/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6.Ex5;

import java.time.LocalDate;

/**
 *
 * @author ADMIN
 */
public class Employee {

    private String ID;
    private String fullName;
    private int yearJoined;
    private double coefficientsSalary;
    private int numDaysOff;
    static final private double basicSalary = 1150.0;

    public Employee() {
        this.ID = "0";
        this.fullName = "";
        this.yearJoined = 2020;
        this.coefficientsSalary = 1.0;
        this.numDaysOff = 0;
    }

    public Employee(String ID, String fullName, double coefficientsSalary) {
        this.ID = ID;
        this.fullName = fullName;
        this.yearJoined = 2020;
        this.coefficientsSalary = coefficientsSalary;
        this.numDaysOff = 0;
    }

    public Employee(String ID, String fullName, int yearJoined, double coefficientsSalary, int numDaysOff) {
        this.ID = ID;
        this.fullName = fullName;
        this.yearJoined = yearJoined;
        this.coefficientsSalary = coefficientsSalary;
        this.numDaysOff = numDaysOff;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearJoined() {
        return yearJoined;
    }

    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }

    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    public int getNumDaysOff() {
        return numDaysOff;
    }

    public void setNumDaysOff(int numDaysOff) {
        this.numDaysOff = numDaysOff;
    }

    public int getCurrentYear() {
        return LocalDate.now().getYear();
    }

    public double getBassicSalary() {
        return basicSalary;
    }

    public double getSenioritySalary() {
        return (getCurrentYear() >= 5) ? (this.yearJoined - this.getCurrentYear()) * this.getBassicSalary() / 100 : 0;
    }

    public String considerEmulation() {
        if (numDaysOff == 2) {
            return "B";
        }
        if (numDaysOff >= 3) {
            return "C";
        } else {
            return "A";
        }
    }
    
    public double getEmulationCoefficient() {
        String e = considerEmulation();
        if ("A".equals(e)) return 1.0;
        else if ("B".equals(e)) return 0.75;
        return 0.5;
    }
    
    public double getSalary() {
        return getBassicSalary() * this.coefficientsSalary * getEmulationCoefficient() + getSenioritySalary();
    }
}
