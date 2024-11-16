/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;

import java.util.Arrays;

/**
 *
 * @author ADMIN
 */
public class Bai1 {
    public static boolean removeElement(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                removeElement(arr, x, i);
                return true;
            }
        }
        return false;
    }
    public static void removeElement(int arr[], int x, int index) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }
    
    public static void insertElement(int arr[], int x, int index) {
        for (int i = arr.length - 2; i > index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = x;
    }
    
    public static int[] findDuplicate(int arr[]) {
        int res[] = new int[arr.length];
        int idx = 0;
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    res[idx++] = arr[i];
                    break;
                }
            }
        }
        
        int dups[] = Arrays.copyOf(res, idx);
        return dups;
    }
    
    public static int[] removeDuplicate(int arr[]) {
        int cnt = 0;
        boolean isDup[] = new boolean[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDup[j] = true;
                    cnt++;
                }
            }
        }
        
        int res[] = new int[arr.length - cnt];
        cnt = 0;
        for (int i = 0; i < isDup.length; i++) {
            if (isDup[i] == false) {
                res[cnt++] = arr[i];
            }
        }
        
        return res;
    }
    
    public static void main(String[] args) {
        int[] arr1a = { 1, 3, 1, 3, 2, 4};
        System.out.println("Xoa phan tu so 1: "+removeElement(arr1a, 1));
        for(int so : arr1a){
            System.out.print(so+ " ");
        }
        System.out.println();
        int[] arr2= {1, 3, 1, 3, 2, 4};
        insertElement(arr2, 3, 2);
        for(int so : arr2){
            System.out.print(so+ " ");
        }
        System.out.println();
        int[] arr3={1, 3, 1, 3, 2, 4};
        int[] duplicate= findDuplicate(arr3);
        for(int so: duplicate){
            System.out.print(so+ " ");
        }
        System.out.println();
        int[] arr4a ={1, 3, 1, 3, 2, 4};
        int[] removea =removeDuplicate(arr4a);
        for(int so: removea){
            System.out.print(so +" ");
        }
//        System.out.println();
//        int[] arr4b ={1, 3, 1, 3, 2, 4};
//        int[] removeb =removeElementb(arr4b);
//        for(int so: removeb){
//            System.out.print(so +" ");
//        }
    }
}