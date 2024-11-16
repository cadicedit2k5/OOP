/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai3 {

    public static Scanner sc = new Scanner(System.in);

    public static String getFirstAndLastName(String fullName) {
        String res;
        fullName = fullName.trim();

        res = fullName.substring(0, fullName.indexOf(" ")) + " "
                + fullName.substring(fullName.lastIndexOf(" ") + 1);

        return res;
    }

    public static String getMiddleName(String fullName) {
        fullName = fullName.trim();
        String res = fullName.substring(fullName.indexOf(" ") + 1, fullName.lastIndexOf(" "));

        return res;
    }

    public static String capitalizeName(String name) {
        name = name.trim();
        String splitName[] = name.split(" ");
        String res = "";

        for (var s : splitName) {
            res += s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase() + " ";
        }

        return res.substring(0, res.length() - 1);
    }

    public static String upperCaseVowels(String name) {
        name = name.trim();
        String res = "";

        String vowels = "aoeui";

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (vowels.contains(String.valueOf(c))) {
                res += Character.toUpperCase(c);
            } else {
                res += Character.toLowerCase(c);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String fullname = "NGUYEN ngoc Linh";

        //3a
        System.out.println("Full name: " + fullname);
        String LastandFirst = getFirstAndLastName(fullname);
        System.out.println("Last name and First name: " + LastandFirst);
        //3b
        String middleName = getMiddleName(fullname);
        System.out.println("Middle name: " + middleName);
        //3c
        String Capitalizea = capitalizeName(fullname);
        System.out.println("Capitalize name cach 1: " + Capitalizea);
        //3d
        String vowel = upperCaseVowels(fullname);
        System.out.println("Uppercase vowel: " + vowel);
    }
}
