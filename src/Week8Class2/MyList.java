
package Week8Class2;


public class MyList {


    public static void main(String[] args) {
        
        double[] list = new double[10];
        list[0] = (int)(Math.random()*10);
        list[1] = (int)(Math.random()*10);
        list[2] = (int)(Math.random()*10);
        list[3] = (int)(Math.random()*10);
        list[4] = (int)(Math.random()*10);
        list[5] = (int)(Math.random()*10);
        list[6] = (int)(Math.random()*10);
        list[7] = (int)(Math.random()*10);
        list[8] = (int)(Math.random()*10);
        list[9] = (int)(Math.random()*10);
        
        for(int i=0; i< list.length; i++){
            System.out.println(list[i]);
        }
        
        
        
        
        double sum = 0;
        for(int i=0; i< list.length; i++){
            sum += list[i];
        }
        System.out.println("The sum is: " + sum);
        
        System.out.println("The max is: " + largest);
        
    }
    

    
    
    public static int largestArrayValue(int[] inputArray){
        int largest = inputArray[0];
        for(int x=0; x< inputArray.length; x++){
            if(inputArray[x]> largest){
                largest = inputArray[x];
            }
        }
        return largest;
    }
    

    
//    public static shiftingArray()
    
    
    
    
    
    
    
//    double getMax(){
//        for (int i=0; i< list.length; i++)
//        Math.max(list[i]);
//    }    
    //System.out.println("The max is: " + Math.max(list[]);
    
    
    public static String formatArrayForPrinting(int[] inputArray){
     StringBuilder sb = new StringBuilder();
     
     for (int value: inputArray){
         sb.append(value);
         sb.append(",");
     }
     return sb.toString();
    }
    
}
