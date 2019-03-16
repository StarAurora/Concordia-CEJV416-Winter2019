
package Week9Class2;
import java.util.ArrayList;
import java.util.List;



public class MyList {


    
    public static void main(String[] args) {
        
        int List_Size = 10;
        ArrayList<Integer> myList = new ArrayList<>();
        
        for (int x=0;x<10;x++ ){
            myList.add((int)(Math.random()*10+1));
        }
        

            System.out.println(formatArrayForPrinting(myList));

        
            System.out.println("The sum of the arrayList is " + sumArray(myList));
            System.out.println("The largest number of the arrayList is " + largestArrayValue(myList));
            
            ArrayList<Integer> newList = new ArrayList<>();
            newList.add(1);
            newList.add(2);
            newList.add(3);
            newList.add(4);
            
            
            ArrayList<Integer> shiftList = shiftArray(newList);
            System.out.println(formatArrayForPrinting(myList));
            
            
    }
        
        public static int sumArray(List<Integer>inputArray)
        {
            int counterSum=0;
            
            for(int x: inputArray)
            {
                counterSum +=x;
            }
            return counterSum;
        }
    
    
        public static int largestArrayValue(List<Integer> inputArray){
        int largest = inputArray.get(0);
        for(int x: inputArray)
        {
            if (x>largest)
            {
                largest = x;
            }
        }
        return largest;
    }
        
        public static String formatArrayForPrinting(List<Integer> inputArray)
        {
            StringBuilder sb = new StringBuilder();
            for (int value : inputArray)
            {
                sb.append(value);
                sb.append(",");
            }
            return sb.toString();
        }
        
        public static ArrayList<Integer> shiftArray(ArrayList<Integer> inputArray)
        {   
            
            
            
            
        int temp = inputArray.get(0);
        inputArray.remove(0);
        inputArray.add(temp);  

        return inputArray;
        
        
        }
                
                
    
}
