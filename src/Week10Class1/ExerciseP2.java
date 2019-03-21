
package Week10Class1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author j_zho11
 */
public class ExerciseP2 {
       static String months[] = {
"Jan", "Feb", "Mar", "Apr",
"May", "Jun", "Jul", "Aug",
"Sep", "Oct", "Nov", "Dec"};

    public static void main(String[] args) {
         
        

        
        Scanner sc =new Scanner(System.in);
        
        GregorianCalendar gc = new GregorianCalendar(2018,Calendar.OCTOBER,10);
        printDate(gc);

        
        gc.set(2019,Calendar.MARCH,20);
        printDate(gc);
        
        
        gc.roll(Calendar.MONTH,4);
        printDate(gc);
        
        gc.add(Calendar.MONTH,4);
        printDate(gc);
    }
    
    private static void printDate(GregorianCalendar gc)
    {
        
        System.out.println(gc.get(Calendar.YEAR)+"-"+months[gc.get(Calendar.MONTH)]+"-"+gc.get(Calendar.DAY_OF_MONTH));
    }

    
        
    
}
