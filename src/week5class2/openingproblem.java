/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5class2;

/**
 *
 * @author j_zho11
 */
public class openingproblem {

    
    public static void main(String[] args) {
//        System.out.println(sum(0));
            System.out.println(max(10,2,26));

    }
    
//    public static int sum(int startnum){
//        
//        int runningSum=0;
//        
//        for (int x=startnum; x<=startnum+10; x++)
//        {
//            runningSum += x;
//        }
//        return runningSum;
//    }       
    
    public static int max(int num1, int num2, int num3){
        
        
        
        if (num1>num2&&num1>num3)
        {
            return num1;
        }
        if (num2>num1&&num2>num3)
        {
            return num2;
        }
        if (num3>num2&&num3>num1)
        {
            return num3;
        }
        return 0;
    } 
    public static int max2(int num1, int num2, int num3){
        
        
        int largest=num1;
        
        if (num2>largest)
        {
            largest=num2;
        }
        if (num3>largest)
        {
            largest=num3;
        }
        return largest;
    }  
    
}
