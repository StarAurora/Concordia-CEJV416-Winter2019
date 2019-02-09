
package Week4Class2;

/**
 *
 * @author j_zho11
 */
public class getAverage {

    
    public static void main(String[] args) 
    {
       System.out.println("The average of 5 and 9 is "+getAverage(5,9));
    }
    
     public static double getAverage(int num1, int num2) 
     {
        System.out.println("I run the int version");
        return (num1+num2)/2;
     }
     public static double getAverage(double num1, double num2) 
     {
        System.out.println("I run the double version");
        return (num1+num2)/2;
     }
    
}
