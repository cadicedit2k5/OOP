/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6.Ex6;

import Lab6.Ex5.Employee;

/**
 *
 * @author ADMIN
 */
public class Manager extends Employee {
    private String position;
    private String department;
    private double salaryCoefficientByPosition;

    public Manager() {
        super();
        this.salaryCoefficientByPosition = 5.0;
    }

    public Manager(String ID, String fullName, double coefficientSalary, String position, double salaryCoefficientPosition)
    {
        super(ID, fullName, coefficientSalary);
        this.position = position;
        this.salaryCoefficientByPosition = salaryCoefficientPosition;
    }    

    public Manager(String position, String department, double salaryCoefficientByPosition, String ID, String fullName, int yearJoined, double coefficientsSalary, int numDaysOff) {
        super(ID, fullName, yearJoined, coefficientsSalary, numDaysOff);
        this.position = position;
        this.department = department;
        this.salaryCoefficientByPosition = salaryCoefficientByPosition;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalaryCoefficientByPosition() {
        return salaryCoefficientByPosition;
    }

    public void setSalaryCoefficientByPosition(double salaryCoefficientByPosition) {
        this.salaryCoefficientByPosition = salaryCoefficientByPosition;
    }
    
    @Override
    public String considerEmulation() {
        return "A";
    }
    
    public double bonusByPosittion() {
        return super.getBassicSalary() * this.salaryCoefficientByPosition;
    }
    
    @Override
    public double getSalary() {
        return super.getBassicSalary() * super.getCoefficientsSalary() * super.getEmulationCoefficient() + super.getSenioritySalary() + bonusByPosittion();
    }       
}
