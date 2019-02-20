
package Lab1;

public class internetpackage {


    
    private double time = 0;
    private double packageHours = 0;
    private double additionalHoursFee = 0;
    private double packageFee = 0;
    

   internetpackage(){
       
   }
    
    internetpackage( double tM, double pH, double aH, double pF){
            time = tM;
            packageHours = pH;
            additionalHoursFee = aH;
            packageFee = pH;
    }
    

    public double getFee(){
        if(time-packageHours>0){
        double fee;
        fee = (time-packageHours) * additionalHoursFee + packageFee;
        return fee;
        }
        else{
            return packageFee;
        }
        
    }
    
    public static void display(){
        System.out.println("Your monthly internet fee is:"+getFee());
    }
}
