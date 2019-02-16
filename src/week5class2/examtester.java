
package week5class2;

/**
 *
 * @author j_zho11
 */
public class examtester {

    public static void main(String[] args) {
        
        int x=1;
        String s = new String();
        
        exam e1= new exam(85,89,99);
        exam e2= new exam(34,29,79);
        System.out.println("The average of e1 is " + e1.getAvg());
        System.out.println("The average of e1 is " + e2.getAvg());
        
        if (e1.isAPass()){
            System.out.println("Exam 1 passed");
        }
        else{
            System.out.println("Exam 1 failed");
        }
    }
    
}
