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
public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char a = sc.next().charAt(0);
        if (isDigitOrLetter(a)) // co the thay the bang phuong Character.isLetterOrDigit(a)
            System.out.println("La mot ky tu!");
        else 
            System.out.println("Khong phai la ky tu!");
    }
    
    public static boolean isDigitOrLetter(char a) {
        return (a >= '0' && a <= '9' )|| (a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z');
    }
}
