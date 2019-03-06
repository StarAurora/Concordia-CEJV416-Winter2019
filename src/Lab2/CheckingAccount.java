
package Lab2;

/**
 *
 * @author staraurora
 */
public class CheckingAccount extends bankAccount{
    
    protected boolean active;
    
    
    public CheckingAccount(double startingBalance, double currentBalance, double interestRate) {
        super(startingBalance, currentBalance, interestRate);
        
    }
    
    
    
    protected double doMonthlyReport(){
        
        serviceCharge = 5 + 0.1 * withdrawNumber;
        super.doMonthlyReport();
        
}
    
    
}
