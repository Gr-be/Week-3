/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week3assignment;

/**
 *
 * @author glaba
 */
public class TestAnimal {
    public static void main(String[] args) {
        Animal snail1 =new Animal((float) 3.5,"Snail", 1);
        snail1.getInfo();
        System.out.println("World population: " +snail1.getAnimalPopulation());
        System.out.println("Animals Alive: "+ snail1.getAnimals());
        System.out.println("");
        
        Animal dog1 = new Animal("Dog");
        dog1.getInfo();
        System.out.println("World population: " +dog1.getAnimalPopulation());
        System.out.println("Animals Alive: "+ dog1.getAnimals());
        dog1.setMass((float) 4.2);
        System.out.println("");
        
        Animal cow1= new Animal((float) 15.0, "Cow", 4);
        cow1.getInfo();
        System.out.println("World population: " +cow1.getAnimalPopulation());
        System.out.println("Animals Alive: "+ cow1.getAnimals());
        System.out.println("");
        
        Animal babyAnimal1;
        Animal babyAnimal2;
        
        babyAnimal1=dog1.reproduce();
        babyAnimal2=cow1.reproduce();
        
        snail1.die();
        
        System.out.println("World population: " +snail1.getAnimalPopulation());
        System.out.println("Animals Alive: "+ snail1.getAnimals());
        System.out.println("");
        
        babyAnimal1.counter=500;
        
        System.out.println("World population: " +snail1.getAnimalPopulation());
        System.out.println("Animals Alive: "+ snail1.getAnimals());
        System.out.println("");
        
        Animal.counter=15;
        
        System.out.println("World population: " +dog1.getAnimalPopulation());
        System.out.println("Animals Alive: "+ dog1.getAnimals());
        System.out.println("");
        
        dog1.die();
        cow1.die();
        babyAnimal1.die();
        babyAnimal2.die();
        System.out.println("World population: " +dog1.getAnimalPopulation());
        System.out.println("Animals Alive: "+ dog1.getAnimals());
        System.out.println("");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        
        
       
    }
    
}
