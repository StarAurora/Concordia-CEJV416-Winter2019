package Week3class1;
import java.util.Scanner;


public class exercise {


    public static void main(String[] args) {
        System.out.println("Please input a number");
        double ran = ((int)(Math.random()*3)+1);
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        
        
        
        if(d>ran){
            System.out.println("The number is too big");
        }
        else
        {
         System.out.println("The number is too small");   
        }
        System.out.println("The number is: "+ ran);
        }
    }

