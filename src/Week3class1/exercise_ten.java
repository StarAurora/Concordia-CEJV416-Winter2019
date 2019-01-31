package Week3class1;
import java.util.Scanner;


public class exercise_ten {


    public static void main(String[] args) {
        System.out.println("Welcome to the Age Calculator");
        System.out.println();  // print a blank line

        // create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // perform invoice calculations until choice isn't equal to "y" or "Y"
        String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {
            // get the invoice subtotal from the user
            System.out.print("Enter The year you born:   ");
            double year = sc.nextDouble();

    

            double age = 2019 - year;

            String message = "Your age is: " + age + "\n"
                     + "The number of month you live is:   " + age*12 + "\n"
                    + "The number of day you live is:   " + age*12*365 + "\n";
            System.out.println(message);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
         }
    }
}
