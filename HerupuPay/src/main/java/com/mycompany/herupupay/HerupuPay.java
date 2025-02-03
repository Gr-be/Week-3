/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herupupay;

import java.util.Scanner;

/**
 *
 * @author glaba
 */
public class HerupuPay {

    public static void main(String[] args) {
        double pay;
        int hours_worked;
        double base_pay;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter hours worked: ");
        hours_worked=input.nextInt();
        System.out.print("Enter your hourly salary: ");
        base_pay=input.nextDouble();
        
        if(hours_worked>=40 && hours_worked<=60 && base_pay>=8){
            base_pay=base_pay*1.5;
            pay=hours_worked*base_pay;
            System.out.println("Wage: $"+pay);
            
        
        }
        else if(hours_worked>60 || base_pay<8){
            System.out.println("Invalid inputs");
            
            
            
        }
        
        else{
            pay=hours_worked*base_pay;
            System.out.println("Wage: $"+pay);
        }
        
        

        
        

        
        
    }
}
