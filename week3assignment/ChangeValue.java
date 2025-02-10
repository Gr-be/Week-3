/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week3assignment;

/**
 *
 * @author glaba
 */
public class ChangeValue{

    private int value1;
    private int value2;
   
   
    //CONSTRUCTOR
     public ChangeValue(int val1, int val2){
    if(val1>5){
        this.value1=val1;
    
    }
    else if(val1<=5){
        this.value1=val1+val2;
    }
    
    if(val2<10){
        this.value2=(val2*val2)+5;
    }
        
     else if(val2>=10){
         this.value2=val2;
                
                
    }
    
    
}
    


    
    

 
public void PrintMethod(){
    System.out.println("Product: " + (this.value1*this.value2));
    
}



    
    //METHODS
}
