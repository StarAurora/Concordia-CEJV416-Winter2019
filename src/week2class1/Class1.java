/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2class1;

/**
 *
 * @author j_zho11
 */
public class Class1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Person p1 = new Person();
         Person p2 = new Person();
         p1.name = "Mary";
         p1.age = 30;
         p2.name = "Bob";
         p2.age = 50;
         
         System.out.println("1st person's name is: " + p1.name);
         System.out.println("The total age of two people" + (p2.age + p1.age));
         
         p2.sayAge();
         
         
         
         Adder a1 = new Adder();
         System.out.println("Sum of two integers values: "+ a1.add(10, 12));
    }

}
