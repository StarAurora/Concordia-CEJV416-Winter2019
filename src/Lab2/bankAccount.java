
package Lab2;
import java.util.Scanner;
import java.text.NumberFormat;
/**
 *
 * @author staraurora
 */
public  abstract class bankAccount {
    
    
    protected double startingBalance=0;
    protected double currentBalance=0;
    protected double totalDeposits=0;
    protected double depositsNumber=0;
    protected double totalWithdraw=0;
    protected double withdrawNumber=0;
    protected double interestRate=0;
    protected double serviceCharge=0;
    double newMoney;

    protected boolean active;
    


    public bankAccount() {}

    public bankAccount(double startingBalance, double interestRate) {
        this.startingBalance = startingBalance;
//        this.currentBalance = currentBalance;
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
    
    protected void makeDeposit(){
        System.out.println("Please enter the moeny you want to deposit.");
        Scanner sc =new Scanner(System.in);
        double newMoney = sc.nextDouble();
        currentBalance = startingBalance + newMoney;
        depositsNumber=depositsNumber+1;
        startingBalance = currentBalance;
        
}
    
    protected void makeWithdraw(){
        System.out.println("Please enter the money you want to withdraw.");
        Scanner sc =new Scanner(System.in);
        double newMoney = sc.nextDouble();
        currentBalance = startingBalance - newMoney;
        depositsNumber=depositsNumber+1;
        startingBalance = currentBalance;
    }
    

    protected double calculateInterest(){
        double monthlyInterestRate = interestRate/12;
        double monthlyInterest = startingBalance * monthlyInterestRate;
        currentBalance = startingBalance + monthlyInterest;
        return currentBalance;
}
    protected double doMonthlyReport(){
    
        currentBalance = startingBalance - serviceCharge;
        calculateInterest();
        depositsNumber=0;
        withdrawNumber=0;
        serviceCharge=0;
        startingBalance = currentBalance;
        return currentBalance;
}
    
    
    protected boolean checkActive(){
        if(currentBalance <25){
            active = false;
        }
        return active=true;
    }
    
    
}
