/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week6Class1;

/**
 *
 * @author j_zho11
 */
public class producttest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        product product1 = new product(code "java", description "intro to java", price 120.00);
     
        
        System.out.println("Product info for product #1");
        
        System.out.println("Code" + product1.getCode());
        System.out.println("Code" + product1.getDescription());
        System.out.println("Code" + product1.getPrice());
        
        
    }
    
}
