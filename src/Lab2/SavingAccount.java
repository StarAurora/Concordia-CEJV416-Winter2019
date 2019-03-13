
package Lab2;

/**
 *
 * @author staraurora
 */
public class SavingAccount extends bankAccount{
    
    protected boolean active;
    
    
    public SavingAccount(double startingBalance,double interestRate, boolean active) {
        super(startingBalance, interestRate);
        this.active = active;
    }
    
    protected void makeWithdraw(){
        super.makeWithdraw();
    }
    
    protected void makeDeposit(){
        super.checkActive();
        super.makeDeposit();
        
//        if(active=true){
//        return super.makeDeposit();
//        }
        if(active = false){
            if(currentBalance>25){
                active=true;
            }
        }
        
    }
    
    protected double doMonthlyReport(){
        super.doMonthlyReport();
        return currentBalance;
    }
    
    
    
}
