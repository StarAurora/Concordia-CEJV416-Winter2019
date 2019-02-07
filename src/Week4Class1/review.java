
package Week4Class1;
import java.util.Scanner;

public class review {

    public static void main(String[] args) {
       
            //final double smallrasepercentage=1.02;
            //final double largerasepercentage=1.10;
            //final int cutoffexperience=10;
             Scanner sc = new Scanner(System.in);
             double salary = 50000;
             System.out.println("Pease enter your working experience");
             System.out.println("Hou many years have you work here?");
             double yearsexp = sc.nextDouble();
             
            if (yearsexp>=10)
            {
                System.out.println("Your new salary will be: "+(int)(salary*1.1)+"$"); 
            }
            else
            {
                System.out.println("Your new salary will be: "+(int)(salary*1.02)+"$"); 
            }
            
        
    }
    
}
