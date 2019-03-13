
package Lab2;

import java.util.Scanner;


public class Bank {
    public static void main(String[] arg){
        Scanner sc =new Scanner(System.in);
        
        bankAccount ba = new bankAccount(100,0.1) {};
        
        
        mainMenu();
        
        char inputOption = sc.next().charAt(0);

        
        switch(inputOption){
            
            case 'A':
        System.out.println("Savings Menu");
        System.out.println("A: Deposit");
        System.out.println("B: Withdraw");
        System.out.println("C: Report"); 
        System.out.println("D: Return to Bank Menu");
                    
        char inputOption2 = sc.next().charAt(0);
        
        
        switch(inputOption2){
            
            case 'A':
            ba.makeDeposit();
        break; 
        
            case 'B':
            ba.makeWithdraw(); 
        break; 
        
            case 'C':
            ba.doMonthlyReport();  
        break; 
          
            case 'D':
            mainMenu();
            break;
          
        }

        case 'B':
        System.out.println("Checking Menu");
        System.out.println("A: Deposit");
        System.out.println("B: Withdraw");
        System.out.println("C: Report"); 
        System.out.println("D: Return to Bank Menu");
                    
        char inputOption3 = sc.next().charAt(0);
        
        switch(inputOption3){
            
            case 'A':
            ba.makeDeposit();
        break; 
        
            case 'B':
            ba.makeWithdraw(); 
        break; 
        
            case 'C':
            System.out.println("Your Current Balance is " + ba.doMonthlyReport()); 
        break; 
          
            case 'D':
            mainMenu();
            break;
          
        }
        
        
        break;
          
        }
        
        
        
//        if(inputOption=='A'){
//        System.out.println("Savings Menu");
//        System.out.println("A: Deposit");
//        System.out.println("B: Withdraw");
//        System.out.println("C: Report"); 
//        System.out.println("D: Return to Bank Menu");
        
        
//        char inputOption2 = sc.next().charAt(0);
//        if(inputOption2=='A'){
//            ba.makeDeposit();
//        }
//        else if (inputOption2=='B'){
//            ba.makeWithdraw();
//        }
//        else if (inputOption2=='C'){
//            ba.doMonthlyReport();
//        }
//        else if (inputOption2=='D'){
//            
//        }
//        
//        
//        }
//        
//        
//        
//        if(inputOption=='B'){
//        System.out.println("Savings Menu");
//        System.out.println("A: Deposit");
//        System.out.println("B: Withdraw");
//        System.out.println("C: Report"); 
//        System.out.println("D: Return to Bank Menu"); 
//        
//        char inputOption2 = sc.next().charAt(0);
//        
//        }
//     
//        if(inputOption=='C'){
//    }
    





       
}
    
    public static void mainMenu(){
        System.out.println("Bank Menu");
        System.out.println("A: Savings");
        System.out.println("B: Checking");
        System.out.println("C: Exit");
    }
    

    
}
   
