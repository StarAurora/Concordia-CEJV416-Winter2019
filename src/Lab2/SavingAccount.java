
package Lab2;

/**
 *
 * @author staraurora
 */
public class SavingAccount extends bankAccount{
    
    protected boolean active;
    
    
    public SavingAccount(double startingBalance, double currentBalance, double interestRate, boolean active) {
        super(startingBalance, currentBalance, interestRate);
        this.active = active;
    }
    
    
    
    
    
    
}
