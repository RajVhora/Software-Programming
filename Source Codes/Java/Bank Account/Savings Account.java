import comp102x.IO;
public class SavingsAccount extends BankAccount{
    private double rateofinterest;
    public SavingsAccount(String name,double initialBalance,double rate){
    super(name,initialBalance);
    rateofinterest=rate;
    }
    public void compoundinterest(int duration){
    for(int i=1;i<=duration;i++){
    double balance=getBalance();
    double finalBalance=balance*rateofinterest;
    makeDeposit(finalBalance);
    }
    }
    public void setRateofinterest(double rate){
    rateofinterest=rate;
    }}