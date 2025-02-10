/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week3assignment;

/**
 *
 * @author glaba
 */
public class Week3Assignment {
   

    //Task 1
    //get the factorials of n positive integers 1,2,…,1000
    public Long getFactorial(int n){
        Long result=1L;
        //your code here
        for (int count=1; count<=n; count++) {
            result*=count;
            
            
        }

        return result;
    }
    

    //Task 2
    //get the sum of the series
    public double sumOfSeries(){
        double result=0;
        for(double count = 1; count<=100; count++){
            result=result+(1/count);
        }

        

        return result;

    }

    //Task 3
    //gets the sum of a square of odd numbers between 22 and 389
    public int sumOfOddSquares(){
        int result=0;
        
        for(int count=22; count<=389; count++)
            
            if(count%2==1){
                result+=(count*count);
                
            }


        

        return result;

    }
    

}