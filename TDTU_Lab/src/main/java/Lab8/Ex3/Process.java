/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8.Ex3;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Process {
    public ArrayList<Student> findStudent(ArrayList<Student> lstStu) {
        ArrayList<Student> res = new ArrayList<>();
        for (var stu : lstStu) {
            if ("A".equals(stu.getRank()) || "Passed".equals(stu.getRank())) {
                res.add(stu);
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        
        students.add(new ITStudent(1, "Test1", 10));
        students.add(new MathStudent("1", "Test2", 3));
        students.add(new ITStudent(2, "Test3", 4));
        students.add(new MathStudent("2", "Test4", 6));
        
        Process p1 = new Process();
        for (var stu : p1.findStudent(students)) {
            System.out.println(stu.getsName());
        }
    }
}
