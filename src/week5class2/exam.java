
package week5class2;


public class exam {
 
    private double examScore1=0;
    private double examScore2=0;
    private double examScore3=0;
    exam(){        
    }
    public exam(double score1, double score2, double score3){
        examScore1 = score1;
        examScore2 = score2;
        examScore3 = score3;      
    }
    
    public double getAvg(){
        double average;
        average = (examScore1 + examScore2 + examScore3) / 3;
        return average;
        }
    
    public boolean isAPass(){
        return getAvg()>60;
    }    
        
    public boolean isAPass(double passingValue){
        return getAvg()>passingValue;
    } 
    
}
