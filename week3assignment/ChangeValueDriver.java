/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week3assignment;

import java.util.Scanner;

/**
 *
 * @author glaba
 */
public class ChangeValueDriver {
    public static void main(String[] args) {
        int val1;
        int val2;
        Scanner input=new Scanner(System.in);
        System.out.print("First Number: ");
        val1=input.nextInt();
        System.out.print("Second Number: ");
        val2=input.nextInt();
        System.out.println("");

        
        ChangeValue product=new ChangeValue(val1, val2);
        
        product.PrintMethod();
        
        
        
        
        
        
        
        
        

        
        
    }
    
}
