/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai1 {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Bai1 bai1 = new Bai1();
        bai1.getAndDisplayInformation();
        System.out.println("Hello");
    }
    
    public void getAndDisplayInformation() {
        System.out.print("Ten cua ban la: ");
        String name = sc.nextLine();
        System.out.print("Ngay/thang/nam sinh: ");
        String dateOfBirth = sc.nextLine();
        System.err.print("ID cua ban: ");
        int id = Integer.parseInt(sc.nextLine());
        
        System.out.println("Ten: "+name);
        System.out.println("ID: "+id);
        System.out.println("Ngay sinh: "+dateOfBirth);
    }
}
