/**
 * 
 */
public class BankAccount{
    private double balance, deposit, withdraw, interest, monthlyIntRate;
    public BankAccount(){
        monthlyIntRate = 0.044/12;
    }
    public BankAccount(int inBalance, double inRate){
        monthlyIntRate = inRate/1200;
        balance = inBalance;
    }
    public BankAccount(double inBalance, double inRate){
        monthlyIntRate = inRate/1200;
        balance = inBalance;
    }
    public void makeDeposit(double add){
        balance += add;
        deposit += add;
    }
    public void makeDeposit(int add){
        balance += add;
        deposit += add;
    }
    public void makeWithdraw(double sub){
        balance -= sub;
        withdraw += sub;
    }
    public void makeWithdraw(int sub){
        balance -= sub;
        withdraw += sub;
    }
    public double getBalance(){
        return balance;    
    }
    public double getInterest(){
        return interest;
    }
    public double getWithdraw(){
        return withdraw;
    }
    public double getDeposit(){
        return deposit;
    }
    public void calcInterest(){
        if(balance>0){
            interest += balance*monthlyIntRate;
            balance *= (1+monthlyIntRate);
        }
    }
}