/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

import java.math.BigDecimal;

/**
 *
 * @author ADMIN
 */
public class Bai8 {
    public static BigDecimal findMax(BigDecimal []arr) {
        BigDecimal max = arr[0];
        for (BigDecimal arr1 : arr) {
            if (arr1.compareTo(max) > 0) {
                max = arr1;
            }
        }
        
        return max;
    }
}
