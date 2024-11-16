/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8.Ex1;

/**
 *
 * @author ADMIN
 */
public class Employee extends Person {
    private String id;
    private int salary;

    public Employee(String id, int salary, String name, int birthYear) {
        super(name, birthYear);
        this.id = id;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return "Employee[id=" + this.id + ", salary=" + this.salary + "]";
    }
}
