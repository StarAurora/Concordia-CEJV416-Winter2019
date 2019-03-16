
package Week9Class2;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class AgeCalculator {


    public static void main(String[] args) {
        
        GregorianCalendar today = new GregorianCalendar();
        int todaysYear = today.get(Calender.YEAR);
        int todaysMonth = today.get(Calender.MONTH)-1;
        int todaysDay = today.get(Calender.DAY);
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the month you were born");
        int month = sc.nextInt();
        System.out.println("Please enter the day of the month you were born");
        int day = sc.nextInt();
        System.out.println("Please enter the year you were born");
        int year = sc.nextInt();
        
        GregorianCalendar birthDate = new GregorianCalendar(year, month-1, day); 
        
        
        
        Dateformat defaultdate = Defaultformat.getDateInstance();
        
        String currentDateString = defaultDate.format(today);
        
        System.out.println("Your birth date is " + currentDateString);
    }
    
}
