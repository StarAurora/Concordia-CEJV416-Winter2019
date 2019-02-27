
package Lab2;

/**
 *
 * @author staraurora
 */
public class bankAccount {
    
    
    protected double startingBalance;
    protected double currentBalance;
    protected double totalDeposits;
    protected double depositsNumber;
    protected double totalWithdraw;
    protected double withdrawNumber;
    protected double interestRate;
    protected double serviceCharge;

    protected boolean active;


    public bankAccount() {
    }

    public bankAccount(double startingBalance, double currentBalance, double interestRate) {
        this.startingBalance = startingBalance;
        this.currentBalance = currentBalance;
        this.interestRate = interestRate;
    }
//==========================starting Balance===============================
    public double getstartingBalance() {
        return startingBalance;
    }

    public void setstartingBalance(double startingBalance) {
        this.startingBalance = startingBalance;
    }
//===========================current Balance==============================
    public double getcurrentBalance() {
        return currentBalance;
    }
 
    public void setcurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }    
//============================total Deposits=============================    
    public double gettotalDeposits() {
        return totalDeposits;
    }

    public void settotalDeposits(double totalDeposits) {
        this.totalDeposits = totalDeposits;
    }    
//===========================deposits Number==============================    
    public double getdepositsNumber() {
        return depositsNumber;
    }

    public void setdepositsNumber(double depositsNumber) {
        this.depositsNumber = depositsNumber;
    }    
//===========================total Withdraw==============================  
    public double gettotalWithdraw() {
        return totalWithdraw;
    }

    public void settotalWithdraw(double totalWithdraw) {
        this.totalWithdraw = totalWithdraw;
    }        
//===========================withdraw Number==============================    
    public double getwithdrawNumber() {
        return withdrawNumber;
    }

    public void setwithdrawNumber(double withdrawNumber) {
        this.withdrawNumber = withdrawNumber;
    }        
//===========================interest Rate==============================    
    public double getinterestRate() {
        return interestRate;
    }

    public void setinterestRate(double interestRate) {
        this.interestRate = interestRate;
    }        
//===========================service Charge==============================    
    public double getserviceCharge() {
        return serviceCharge;
    }

    public void setserviceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

//===========================is Active==============================
   
    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
//====================================================================
    
    
    
    
    public double makeDeposit() {
        return dateCreated;
    }

    public double makeWithdraw() {
        return
    }
    
    public double calculateInterest{
    
}
    public double doMonthlyReport{
    
}
    
    
}
