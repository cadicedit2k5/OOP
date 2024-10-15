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
public class Bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        //Bai 4a
//       int n;
//       
//       n = sc.nextInt();
//       int[] a = new int[n];
//       
//       
//       for (int i = 0; i < n; i++) {
//           a[i] = (int)(Math.random() * 100);
//       }
//       
//       xuatMang(a);
//       
//       int cntPrime = 0;
//       for (int i = 0; i < n; i++) {
//           int x = a[i];
//           if (isPrime(x)) cntPrime++;
//       }
        //Lap trinh dong chay(Stream)
//        System.out.println(IntStream.of(a).filter(x -> isPrime(x)).sum());
//       
//        System.out.println("Tong so nguyen to = " + cntPrime);

//        //Bai4b
//        int n2 = sc.nextInt();
//        int[] b = new int[n2];
//        
//        b = nhapMang(n2);
//        
//        int minusMin = soAmBeNhat(b);
//        int positiveMax = soDuongLonNhat(b);
//        
//        if (minusMin >= 0) {
//            System.out.println("*");
//        }else {
//            System.out.println(minusMin);
//        }
//        
//        if (positiveMax <= 0) {
//            System.out.println("*");
//        }else {
//            System.out.println(positiveMax);
//        }
//        System.out.println(IntStream.of(b).filter(x -> x > 0).max().orElse(0));
//        
        //Bai 4c
        int n;
//       
        n = sc.nextInt();
        int[] a = new int[n];

        a = nhapMang(n);

        xuatMang(a);

        int idx = 0;
        int minPrime = Integer.MAX_VALUE;
        for (var x : a) {
            if (isPrime(x) && x < minPrime) {
                minPrime = x;
            }
        }
        
        if (minPrime == Integer.MAX_VALUE) {
            System.out.println("Khong co so nguyen to");
        }else {
            System.out.println(minPrime);
        }
        
        //Bai 4d
        
    }

    public static int[] nhapMang(int n) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        return a;
    }

    public static void xuatMang(int[] a) {
        for (var x : a) {
            System.out.printf("%d\t", x);
        }
        System.out.println();
    }

    public static boolean isPrime(int x) {
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int soDuongLonNhat(int[] a) {
        int res = Integer.MIN_VALUE;

        for (var x : a) {
            res = Math.max(res, x);
        }

        return res;
    }

    public static int soAmBeNhat(int[] a) {
        int res = Integer.MAX_VALUE;

        for (var x : a) {
            res = Math.min(res, x);
        }

        return res;
    }
    
    public static int[] sapsepMangNguyenTo(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (!isPrime(a[i])) continue;
            for (int j = i+1; j< a.length; j++) {
                if (!isPrime(a[j])) continue;
                
//                if (a[i] > a[j]) //swap trong nay;
            }
        }
        
        return a;
    }
    
}
