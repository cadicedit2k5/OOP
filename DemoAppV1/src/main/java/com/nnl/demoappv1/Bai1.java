/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nnl.demoappv1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai1 {
    public static void main(String[] args) {
        int n = (int)(Math.random() * 100);
        
        Scanner sc = new Scanner(System.in);
        int guest;
        do {
            guest = sc.nextInt();
            
            if (guest > n) {
                System.out.println("SO BAN NHAP LON HON!");
            }else if (guest < n) {
                System.out.println("SO BAN NHAP BE HON!");
            }else {
                System.out.println("CHINH XAC!");
            }
        } while (guest != n);
    }
}
