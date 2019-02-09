
package Week4Class2;


public class isEven {

    
    public static void main(String[] args) {
        int x=5;
        if(isEven(x))
        {
            System.out.println("The value "+x+" is even");
        }
        else
        {
            System.out.println("The value "+x+" is odd");
        }
        
    }
    
    public static boolean isEven(int candidate) {
        
        return candidate%2==0;
        
        
//        if (candidate %2==0)
//        {
//            return true;
//        }
//        else{
//            return false;
//        }
    }
    
}
