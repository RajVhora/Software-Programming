
public class BankAccount{
    private String Name="";
    private double Balance =0.00; 
    public BankAccount(String name,double balance){
        Name=name;
        Balance=balance;
    }
    public void makeDeposit(double balance){
        Balance=Balance+balance;
    }
    public void makeWithdrawl(double amount){
        if (amount<=this.Balance){
        Balance=Balance-amount;
    }  
    else{
    System.out.println("You Don't have enough balance.");
    }
    }
    public double getBalance(){
        return Balance;
    }
}