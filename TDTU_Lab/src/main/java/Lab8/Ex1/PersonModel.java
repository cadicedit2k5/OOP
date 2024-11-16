/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8.Ex1;

/**
 *
 * @author ADMIN
 */
import java.util.ArrayList;

public class PersonModel<T> {

    private ArrayList<T> al = new ArrayList<T>();

    public void add(T obj) {
        al.add(obj);
    }

    public void display() {
        for (T obj : al) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        // code here 
        PersonModel<Student> ps = new PersonModel<>();
        
        ps.add(new Student("1", 10, "Linh", 2005));
        ps.add(new Student("2", 10, "Khai", 2003));
        ps.display();
    }
}
