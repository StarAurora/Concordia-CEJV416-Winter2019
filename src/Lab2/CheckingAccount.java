
package Lab2;

/**
 *
 * @author staraurora
 */
public class CheckingAccount extends bankAccount{
    
    protected boolean active;
    
    
    public CheckingAccount(double startingBalance, double interestRate) {
        super(startingBalance,  interestRate);
        
    }
    
    protected void makeWithdraw(){
        
       
        if(startingBalance-newMoney<0){
            currentBalance= startingBalance-15;
            if(startingBalance-15<0){
                active=false;
            }
        }
        super.makeWithdraw();           
    }
    
    protected void makeDeposit(){
        super.makeDeposit();
    }
    
    
    protected double doMonthlyReport(){
        
        serviceCharge = 5 + 0.1 * withdrawNumber;
        super.doMonthlyReport();
        
        
        return currentBalance;
}
    
    
}
