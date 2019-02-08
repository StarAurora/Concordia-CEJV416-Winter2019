
package Week4Class1;
import java.util.Scanner;

public class NewClass {


    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             System.out.println("Pease enter a number");
             double num = sc.nextDouble();


             
             
             if (num%2==0)
             {
                for(int i=1;i<=num;i++)
                {
                    for(int j=1;j<=i;j++)
                     {
                System.out.print("*");
            }
            System.out.println();
        }      
             }
             else if(num%2==1){
                 for (int i = 0; i <= num; i++) {
                    for (int j = 0; j < num - i; j++) {
                        System.out.print(" ");
                        }
                 for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("*");
                        }
                        System.out.println();
                        }

                 for (int i =     (int) (num - 1); i > 0;i--) {
                    for (int j = 0; j < num - i; j++) {
                        System.out.print(" ");
                        }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("*");
                        }
                        System.out.println();
                        }             
    }
    
}
}