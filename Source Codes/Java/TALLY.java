import comp102x.IO;
public class tally
{
    private String assessee="Noname";
    private double totalin=0.0;
    private double totalout=0.0;
    double[] amountinp=new double[100];
    String[] particularinp=new String[100];
    int i=0;
    int o=0;
    double[] amountou=new double[100];
    String[] particularou=new String[100];
    int[] dayin=new int[100];
    int[] monthin=new int[100];
    int[] yearin=new int[100];
    int[] dayout=new int[100];
    int[] monthout=new int[100];
    int[] yearout=new int[100];
    public  tally() {};
    public tally(String name)
    {
        assessee=name;
    }
    public void addincome(double amountin,String particularin,int dayinp,int monthinp,int yearinp)
    {
        
        totalin=totalin+amountin;
        amountinp[i]=amountin;
        particularinp[i]=particularin;
        dayin[i]=dayinp;
        monthin[i]=monthinp;
        yearin[i]=yearinp;
        i++;
    }
    public void addexpenditure(double amountout,String particularout,int dayou,int monthou,int yearou)
    {
        totalout=totalout+amountout;
        amountou[o]=amountout;
        particularou[o]=particularout;
        dayout[o]=dayou;
        monthout[o]=monthou;
        yearout[o]=yearou;
        o++;
    }
    public void incometax()
    {
       double taxable,diff,tax;
        diff=totalin-totalout;
        if(diff<0.0)
        {
        IO.outputln("ERROR:Expenditure exceeds income!");
    }
    if(diff==0.0)
    {
        IO.outputln("You have a PERFECTLY balanced budget.No income tax.");
    }
        if(diff>0.0 && diff<=250000)
        {
            IO.outputln("Your income is tax free!");
        }
        if(diff>250000 && diff<=500000)
        {
            taxable=diff-250000;
            tax=taxable*0.1;
            IO.outputln("Your income tax is "+tax);
        }
        if(diff>500000 && diff<=1000000)
        {
            taxable=diff-500000;
            tax=25000+(taxable*0.2);
            IO.outputln("Your income tax is "+tax);
        }
        if(diff>1000000)
        {
            taxable=diff-1000000;
            tax=125000+(taxable*0.3);
            IO.outputln("Your income tax is "+tax);
        }
    }
    public void balancesheet()
    {
        int x=0;
        int y=0;
        IO.outputln("Incomes as follows");
        for(x=0;x<i;x++)
        {
            IO.outputln(particularinp[x]+"  "+amountinp[x]+" "+dayin[x]+"/"+monthin[x]+"/"+yearin[x]);
        }
        IO.outputln("Total = "+totalin);
        IO.outputln(" ");
        IO.outputln("Expenses as follows");
        for(y=0;y<o;y++)
        {
            IO.outputln(particularou[y]+"  "+amountou[y]+" "+dayout[y]+"/"+monthout[y]+"/"+yearout[y]);
        }
        IO.outputln("Total = "+totalout);
    }
    public static void main(String[] args) {}
}
