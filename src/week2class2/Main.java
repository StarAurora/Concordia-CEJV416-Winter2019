/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2class2;
import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author j_zho11
 */
public class Main {


    public static void main(String[] args) {
        
//        double price=11.76;
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
// 
//        String priceString = currency.format(price);
//        
//        System.out.println(priceString);

           


//         float c = (float)0.1;
//         float f =((float)9/5)*c+32;
//         System.out.println(f);
         
//         float f = (float)86;
//         float c = (f-32)/((float)9/5);
//         System.out.println(c);
//         
            
            double originalPrice = 11.575;
            
            final double QST = 0.1;
            final double GST = 0.05;
            
            double price_qst = originalPrice*QST;
            double price_gst = originalPrice*GST;
            double price_total = originalPrice*1.15;
            
            NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH);
            String priceString = currency.format(originalPrice);
            
            NumberFormat percentage = NumberFormat.getPercentInstance(Locale.CANADA_FRENCH);
            String gstString = percentage.format(QST);
            String qstString = percentage.format(GST);

            String fpriceString = currency.format(price_total);
            String gpriceString = currency.format(price_gst);
            String qpriceString = currency.format(price_qst);
            
            System.out.println("Price: " + priceString);
            System.out.println("QST("+gstString+"):"+qpriceString);
            System.out.println("GST("+qstString+"):"+gpriceString);
            System.out.println("Total Price: "+ fpriceString);
            
            
            
            
            
            double miles = 341.253673;
            NumberFormat number = NumberFormat.getNumberInstance();
            number.setMaximumFractionDigits(2);
            String milesString = number.format(miles);
            
            System.out.println(milesString);
            
            
            

            
            int first = 14;
            int second = 4;
            
            String firstString =Integer.toString(first);
            String secondString =Integer.toString(second);
            
            
            System.out.println(firstString+" + "+secondString+" is "+(first+second));
            System.out.println(firstString+" * "+secondString+" is "+(first*second));
            System.out.println(firstString+" % "+secondString+" is "+(first%second));
            System.out.println(firstString+" / "+secondString+" is "+(first/second));

            
            
    }
    
}
