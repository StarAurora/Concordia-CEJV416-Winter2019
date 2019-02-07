
package Week4Class1;
import java.util.Scanner;

public class SwitchExercise {
//BMI

    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             System.out.println("Pease enter your weight in kilogram");
             double Weight = sc.nextDouble();
             System.out.println("Pease enter your height in meters");
             double Height = sc.nextDouble();
             
             double bmi = (Weight/Math.pow(Height, 2));
             
             if(bmi<18.5)
             {
               System.out.println("Your bmi is underweight.");  
             }
             else if(bmi<24.9){
                 System.out.println("Your bmi is Normal.");       
             }
             else if(bmi<29.9){
                 System.out.println("Your bmi is overweight.");       
             }
             else{
                    System.out.println("Your bmi is Obese");       
             }
             
             
             
              
    }
    
}