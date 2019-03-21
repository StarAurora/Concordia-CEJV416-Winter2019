
package Week10Class1;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Birth2 {
    public static void main(String[] args) {


        
        Scanner sc =new Scanner(System.in);
        
        GregorianCalendar today = new GregorianCalendar();
        GregorianCalendar bday = new GregorianCalendar();
        
        
        
//        int todaysYear = today.get(Calendar.YEAR);
//        int todaysMonth = today.get(Calendar.MONTH) + 1;
//        int todaysDay = today.get(Calendar.DAY_OF_MONTH);
        
        

        System.out.println("Please enter the month you were born");
        bday.set(Calendar.MONTH, sc.nextInt());
//        int month = sc.nextInt();
        System.out.println("Please enter the day of the month you were born");
        bday.set(Calendar.DAY_OF_MONTH, sc.nextInt());
//        int day = sc.nextInt();
        System.out.println("Please enter the year you were born");
        bday.set(Calendar.YEAR, sc.nextInt());
//        int year = sc.nextInt();


//        System.out.println("Today's date is " + today.toString());
        
        int todaysYear = today.get(Calendar.YEAR);
        int todaysMonth = today.get(Calendar.MONTH);
        int todaysDay = today.get(Calendar.DAY_OF_MONTH);
        
        int birthYear = bday.get(Calendar.YEAR);
        int birthMonth = bday.get(Calendar.MONTH);
        int birthDay = bday.get(Calendar.DAY_OF_MONTH);
        
        int age = todaysYear - birthYear;
        if(todaysMonth<birthMonth)
        {
            age -=1;
        }
        if(todaysMonth==birthMonth&&todaysDay<birthDay)
        {
            age -=1;
        }
     
   

        
        System.out.println("Your age is "+ age);
        System.out.println("Your birthday is "+ bday.getTime().toString());
        
        Date x = new Date();
        x.getTime();
    }
    
}
