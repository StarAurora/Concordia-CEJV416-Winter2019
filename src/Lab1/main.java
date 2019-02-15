
package Lab1;
import java.util.Scanner;

public class main {
    public static void main(String[] arg){
        
        System.out.println("Package A: For $9.95 per month 10 hours of access are provided. Additional hours are $2.00 per hour.");
        System.out.println("Package B: For $14.95 per month 20 hours of access are provided. Additional hours are $1.00 per hour.");
        System.out.println("Package C: For $19.95 per month unlimited access is provided.");
        System.out.println("Please enter the package you purchased for your internet service:");
        Scanner sc =new Scanner(System.in);
        
        String packagecode = sc.next();
        System.out.println("You purchased Package "+ packagecode);
        System.out.println("Please enter how many hours did you use the internet");
        System.out.println("Please be note that you can not enter the number over than 744");
        double time = sc.nextDouble();
    
    
    if(packagecode=='A'){
        if(time<10){
           System.out.println("Your bill will be $9.95"); 
        }
    }
    
    
    
    
    
    
    }
}