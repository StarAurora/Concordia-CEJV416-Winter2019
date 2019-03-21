
package Week10Class1;

import java.math.BigDecimal;
import java.text.NumberFormat;


public class bigdecimal {


    public static void main(String[] args) {
        
        BigDecimal b = new BigDecimal("8.05");
        System.out.println(b);
        
        BigDecimal b2 = new BigDecimal("18.22");
        System.out.println(b2);
        
        BigDecimal b3 = b2.add(b);
        System.out.println(b3);
        
        double d = 10.5;
        NumberFormat curr = NumberFormat.getCurrencyInstance();
        
        System.out.println(curr.format(b3));
    }
    
}
