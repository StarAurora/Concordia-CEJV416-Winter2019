package Week3class2;
import java.util.Scanner;


public class Hi {


    public static void main(String[] args) {
        
        // ================================================================
        
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("Please input a number you like");
//        double num = sc.nextDouble();
//        
//        if(num%5==0){
//            System.out.println("HiFive!");
//        }
//        else if (num%2==0)
//        {
//            System.out.println("HiEven!");   
//        }
//        else{
//            System.out.println("Ooops!"); 
//        }



// ================================================================

//        int x=77;
//        System.out.print(x>22?"Greater than 22":"Less than 22");



// ================================================================
//        String name = "Joe";
//        String name2 = "Joe";
//        
//        if (name.equals(name2))
//        {
//         System.out.println("Name is Joe"); 
//        }
// ================================================================
//            int x = 80;
//            if (x>=0&&x<=100&&x%3==0)
//            {
//                System.out.println("Yes"); 
//            }
//            else
//            {
//                System.out.println("No"); 
//            }
            
            //=================================================================
            int a = (int)(Math.random()*10);
            int b = (int)(Math.random()*10);
            System.out.println("What is "+(int)a+"+"+(int)b+"equals to?");
            Scanner sc = new Scanner(System.in);    
            double num = sc.nextDouble();
            if (num == (int)(a+b))
            {
              System.out.println(a+"+"+b+"equals to"+num);  
            }
            else 
            {
              System.out.println("Ohhhhh...");    
            }
    }
}

