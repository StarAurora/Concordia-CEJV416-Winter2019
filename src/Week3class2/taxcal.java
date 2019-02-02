package Week3class2;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class taxcal {


    public static void main(String[] args) {
        System.out.println("Please input a the price");
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        
        
        // method 1
        
//        double pst = d*0.05;
//        double gst = d*0.0997;
//                
//                
//        System.out.println("PST: " + pst);
//        System.out.println("QST: " + gst);
//        System.out.println("Total Price: " + (d+pst+gst)+"$");
        



// method 2
        
            final double QST = 0.0997;
            final double GST = 0.05;
            
            double price_qst = d*QST;
            double price_gst = d*GST;
            double price_total = d*1.1497;
            
            NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH);
            String priceString = currency.format(d);
            
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
        
    }
}

