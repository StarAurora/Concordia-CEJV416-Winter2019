/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week8Class1;


public class Cat extends Animal implements IAnimal {
    
    public void run(){
        System.out.println("I ran really fast.");
    }
    
    public void eat(){
        System.out.println("I ate some meat.");
    }
    
    public char getAnimalType(){
        return REPTILE;
    }
}
