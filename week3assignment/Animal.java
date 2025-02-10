package com.mycompany.week3assignment;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author glaba
 */
public class Animal {
    float mass;
    String species_name;
    int legs;
    boolean isAlive;
    static int counter;
    static int animals_alive;
    
    public void setMass(float animal_mass){
        this.mass=animal_mass;
        
    }
    
    public void getInfo(){
        System.out.println("Animal Name: " + species_name);
        System.out.println("Number of Legs: " + legs);
        System.out.println("Mass: "+ mass);
        System.out.println("Living: "+ isAlive);
        
    }
    
    public Animal(String name){
        this.species_name=name;
        this.isAlive=true;
        this.counter+=1;
        this.mass=0;
        this.legs=0;
        this.animals_alive+=1;
       
    }
    public Animal(float mass, String name, int legs){
        this.mass=mass;
        this.species_name=name;
        this.legs=legs;
        this.isAlive=true;
        this.counter+=1;
        this.animals_alive+=1;
    }
    
    public int getAnimalPopulation(){
        return this.counter;
    }
    
    public int getAnimals(){
        return this.animals_alive;
    }
    
    public Animal reproduce(){
        
        
        Animal creature= new Animal(this.mass/2, this.species_name, this.legs);
        
        return creature;
        

                  
    }
 
    public void die(){
        this.animals_alive=this.animals_alive-1;
        isAlive=false;
                
    }    
    
   
        
    
        
                
               
    
    
}
