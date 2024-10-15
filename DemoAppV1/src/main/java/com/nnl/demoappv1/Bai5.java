/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nnl.demoappv1;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author admin
 */
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap n = ");
        int n = sc.nextInt();
        
        System.out.println("Nhap m = ");
        int m = sc.nextInt();
        
        int[][] a = sinhMang(n, m);
        xuat(a, n, m);
        
        int[] tongDong = new int[n];
        //Tong dong
        for (int i = 0; i < n; i++) {
            tongDong[i] =  IntStream.of(a[i]).sum();
        }
        
        int[] tongCot = new int[m];
        
        for (int j = 0; j < m; j++) {
            int tong = 0;
            for (int i = 0; i < n; i++) {
                tong += a[i][j];
            }
            tongCot[j] = tong;
        }
        xuatMangMotChieu(tongDong);
        xuatMangMotChieu(tongCot);
        
        System.out.println("Max tren dong " + IntStream.of(tongDong).max());
        System.out.println("Max tren cot " + IntStream.of(tongCot).max());
        }
    
    public static int[][] sinhMang(int n, int m) {
        int [][] a = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = (int)(Math.random() * 99 + 1);
            }
        }
        
        return a;
    }
    
    public static void xuat(int [][] a, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void xuatMangMotChieu(int[] a) {
        for (var x: a) {
            System.out.printf("%d\t", x);
        }
        System.out.println();
    }
}
