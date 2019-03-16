
package Week9Class2;

/**
 *
 * @author j_zho11
 */
public class Exercise27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String fullName = "   Sunny Moon   ";
        
        int indexOfSpace = fullName.index0f(" ");
        System.out.println("Welcome to the name parser.");
        System.out.println("Enter a Name: Sunny Moon");
        

        String firstname = fullName.substring(0,indexOfSpace);
        String lastname = fullName.substring(indexOfSpace+1);
        System.out.println("The Last name is: " + lastname);
        
        
        
        
    }
    
}
