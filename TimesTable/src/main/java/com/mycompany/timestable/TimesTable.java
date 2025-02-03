/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.timestable;

/**
 *
 * @author glaba
 */
public class TimesTable {

    public static void main(String[] args) {
        for (int first_num = 1; first_num <= 13; first_num++) {
            System.out.println("Multiples of " + first_num);
            
            // Loop through numbers 1 to 13 for each multiplication table
            for (int second_num = 1; second_num <= 13; second_num++) {
                System.out.println(first_num+" * "+second_num+" = "+first_num*second_num);
            }
            System.out.println();
        }
    }
}
