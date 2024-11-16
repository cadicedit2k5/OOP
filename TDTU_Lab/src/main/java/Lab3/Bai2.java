/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;

/**
 *
 * @author ADMIN
 */
public class Bai2 {
    public static int[][] addMatrices(int a[][], int b[][]) {
        if (a.length != b.length || a[0].length != b[0].length) {
            System.out.println("Two matrices are not the same size!");
            return null;
        }
        
        int[][] sumMatrices = new int[a.length][a[0].length];
        for (int i = 0; i < sumMatrices.length; i++) {
            for (int j = 0; j < sumMatrices[0].length; j++) {
                sumMatrices[i][j] = a[i][j] + b[i][j];
            }
        }
        return sumMatrices;
    }
    
    public static void multilyMatrix(int arr[][], int k) {
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                arr1[j] *= k;
            }
        }
    }
    
    public static void printMatrix(int arr[][]) {
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("%d\t", arr1[j]);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int [][] m1 = {{1,2,3},{4,5,6}};
        int [][] m2 = {{7,8,9},{10,11,12}};
        int k = 2;
        //2a
        System.out.println("2a:");
        System.out.println("Matrix A:");
        printMatrix(m1);
        System.out.println("+");
        System.out.println("Maxtrix B: ");
        printMatrix(m2);
        System.out.println("=");
        int[][] addMatrices = addMatrices(m1, m2);
        printMatrix(addMatrices);
        //2b
        System.out.println("2b:");
        System.out.println("Maxtrix A:");
        printMatrix(m1);
        System.out.println("*");
        System.out.println("k");
        System.out.println("=");
        System.out.println(k);
        multilyMatrix(m1, k);
        printMatrix(m1);
    }
}
