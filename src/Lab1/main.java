
package Lab1;
import java.util.Scanner;

public class main {
    public static void main(String[] arg){
            double totalHours = 0;
            double packageHours = 0;
            double additionalHoursFee = 0;
            double packageFee = 0;

            boolean correctresponse=false;
            
        System.out.println("Package A: For $9.95 per month 10 hours of access are provided. Additional hours are $2.00 per hour.");
        System.out.println("Package B: For $14.95 per month 20 hours of access are provided. Additional hours are $1.00 per hour.");
        System.out.println("Package C: For $19.95 per month unlimited access is provided.");
        System.out.println("Please enter the package you purchased for your internet service:");
        Scanner sc =new Scanner(System.in);
        char packagecode = sc.next().charAt(0);
             
//            while(!correctresponse){
//            System.out.println("Please re-enter the internet package");
//            char pc = sc.next().charAt(0);
//            correctresponse=(pc=='A' || pc=='B' || pc=='C');
//            }        
//        char packagecode = pc;
        
        
        if(packagecode=='A'){
           packageHours = 10;
           additionalHoursFee = 2;
           packageFee = 9.95;
        }
        if(packagecode=='B'){
            packageHours = 20;
            additionalHoursFee = 1;
            packageFee = 14.95;
        }
        if(packagecode=='C'){
            packageHours = 744;
            additionalHoursFee = 0;
            packageFee = 19.95;
        }
        if(packagecode!='C'&&packagecode!='B'&&packagecode!='A'){
        System.out.println("Ok I thought you should consieder the package C");
            packageHours = 744;
            additionalHoursFee = 0;
            packageFee = 19.95;
        }

        
        
        System.out.println("You purchased Package "+ packagecode);
        System.out.println("Please enter how many hours did you use the internet");
        double time = sc.nextDouble();
        if(time>744){
            System.out.println("The largest number you can enter is 744");
            time = 744;
        }
        
        internetpackage i1= new internetpackage(time, packageHours, additionalHoursFee, packageFee);
        
        
        System.out.println("Your monthly internet fee is:"+i1.getFee());

        internetpackage.display();
    
        
        
    }
    
    
    
}


