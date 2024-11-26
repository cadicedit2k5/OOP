
import Bai3.*;
import Bai4.*;
import java.lang.reflect.InvocationTargetException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author admin
 */
public class Demo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        SanPham s1 = new Sach("OOP", "Sach OOP", "OU", 100, 200);
        SanPham s2 = new Sach("OOP OU", "Sach OOP Ou", "OU", 120, 100);
        SanPham s3 = new BangDia("Ou", "Bang dia OU", "OU", 80, 120);
        SanPham s4 = new BangDia("Hello", "Bang dia OU", "find", 140, 120);

        QuanLySanPham q1 = new QuanLySanPham();
        q1.add(s1, s2, s3, s4);
        q1.add("Bai3.Sach");
        q1.add("Bai3.BangDia");
        q1.display();
        
        System.out.println("===============\n");
        q1.sort();
        q1.display();
        
        System.out.println("Find===============\n");
        q1.find("Bai3.Sach").forEach((var s) -> {
            System.out.println(s + "\n");
        });
        

    }
}
