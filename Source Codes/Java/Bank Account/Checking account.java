import comp102x.IO;
public class CheckingAccount extends BankAccount{
    private int feepercheque;
    public CheckingAccount(String name,double balance,int fee){
    super(name,balance);
    feepercheque=fee;
}
    public void Withdrawl(double amount){
    super.makeWithdrawl(amount+feepercheque);
    }
    public void showbalance(){
    IO.output("Balance:"+super.getBalance());
    }}