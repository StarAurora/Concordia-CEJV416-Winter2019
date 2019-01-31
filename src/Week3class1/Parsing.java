/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3class1;

/**
 *
 * @author j_zho11
 */
public class Parsing {

//
    public static void main(String[] args) {
//        try {
//            System.out.println("I just opened a file"); 
//        String inputVal = "2x";
//        int x=7/0;
//        int val= Integer.parseInt(inputVal);
//    }
//        catch(NumberFormatException myexceptiondetail)
//        {
//           System.out.println("The value coould not be parsed"); 
//        }
//        
//        catch(Exception myexceptiondetail)
//        {
//           System.out.println("A general error occurred");
//           System.out.println("Here is what happened");
//           System.out.println(myexceptiondetail.getMessage());
//        }
//        finally{
//            System.out.println("I just closed the file"); 
//        }
//    }
    
    double degree = 123;
    double radians = degree * (Math.PI/180);
   
    double sinb = Math.sin(radians);
    
    double area = ((double)1/2)*150*231*sinb;

    System.out.println("The area is: " + Math.round(area)+"m^2"); 
}
}