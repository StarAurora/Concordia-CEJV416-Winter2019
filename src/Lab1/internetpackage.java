
package Lab1;

public class internetpackage {



    
    private double time = 0;
    private double packageHours = 0;
    private double additionalHoursFee = 0;
    private double packageFee = 0;
    

   internetpackage(){}
    
    internetpackage( double tM, double pH, double aH, double pF){
            time = tM;
            packageHours = pH;
            additionalHoursFee = aH;
            packageFee = pF;
    }
    

    public double getFee(){
        double fee;
//        if(packageFee==19.95){
//            return packageFee;
//        }
        if(time-packageHours>0){
        fee = (time-packageHours) * additionalHoursFee + packageFee;
        return fee;
        }
        
        else{
            return packageFee;
        }
        
    }
    

}
