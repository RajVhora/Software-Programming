import comp102x.IO;
import comp102x.Canvas;
import comp102x.ColorImage;
public class Patient_Database{ 
     String[] Name=new String[5];
     String[] Address=new String[5];
     long[] Case_Paper_Number=new long[5];
     int[] Date=new int[5];
     int[] Month=new int[5];
     int[] Year=new int[5];
     String[] Sex=new String[5];
     int i=0;
     String[] Treatment_Done=new String[5];
     String Treatment="";
     long Amountpaidtillnow=0;
     long[] Amountpaid=new long[5];
     int[] Age=new int[5];
     ColorImage[][] xrays=new ColorImage[5][5];
     int xraynum=0;
     /**GIVE THE DETAILS OF NEW PATIENT.
      * 
      */
     public void NEW_PATIENT(String name,String address,int date,int month,int year,String sex,int age)
     {
         Name[i]=name;
         Address[i]=address;
         Case_Paper_Number[i]=i+1;
         Date[i]=date;
         Month[i]=month;
         Year[i]=year;
         Sex[i]=sex;
         Age[i]=age;
         i++;
        }
        /**GIVE THE CASE PAPER NUMBER OF REQUIRED PATIENT.
         * 
         */
     public void SEARCH_PATIENT_BY_CASE_PAPER_NUMBER(long csn)
     {
        int j=0;
        for (j=0;j<=i;j++)
        {
            if (Case_Paper_Number[j]==csn)
            {
                System.out.println("Name:"+Name[j]);
                System.out.println("Address:"+Address[j]);
                System.out.println("Case Paper Number:"+Case_Paper_Number[j]);
                System.out.println("Date of Admission:"+Date[j]+"/"+Month[j]+"/"+Year[j]);
                System.out.println("Sex:"+Sex[j]);
                System.out.println("Age as on Date of admission:"+Age[j]);
                System.out.println("Treatment done till now:"+Treatment_Done[j]);
                System.out.println("Amount paid till now:"+Amountpaid[j]);
    }
}
    }
    /**GIVE THE NAME OF REQUIRED PATIENT AS GIVEN FOR THE FIRST TIME.
     * 
     */
    public void SEARCH_PATIENT_BY_NAME(String name)
{
for(int j=0;j<=i;j++)
	{
	if(Name[j]==name)
	{
	System.out.println("Name:"+Name[j]);
                System.out.println("Address:"+Address[j]);
                System.out.println("Case Paper Number:"+Case_Paper_Number[j]);
                System.out.println("Date of Admission:"+Date[j]+"/"+Month[j]+"/"+Year[j]);
                System.out.println("Sex:"+Sex[j]);
                System.out.println("Age as on Date of admission:"+Age[j]);
                System.out.println("Treatment done till now:"+Treatment_Done[j]);
                System.out.println("Amount paid till now:"+Amountpaid[j]);
}
}
}
    /**TYPE THE CASE PAPER NUMBER AND TREATMENT DONE AND AMOUNT PAID TO UPDATE THE INFORMATION OF PATIENT.
     * 
     */
public void UPDATE_PATIENT_TREATMENT_INFO(int csn,String Treatment_Today,long amountpaidtoday )
{
Treatment=Treatment+"\n"+Treatment_Today;
Treatment_Done[csn-1]=Treatment;
Amountpaidtillnow=Amountpaidtillnow+amountpaidtoday;
Amountpaid[csn-1]=Amountpaidtillnow;
}
/**GIVE THE CASE PAPER NUMBER OF THE PATIENT.
 * 
 */
public void UPDATE_PATIENT_INFO(int csn)
{
int choice;
String name;
int age;
String address;
System.out.println("What do you want to update?");
IO.output("1)Name");
IO.output("2)Address");
IO.output("3)Age");
IO.output("Type the Index number");
choice=IO.inputInteger();
switch(choice)
{
case 1:
IO.output("ReEnter name:");
name=IO.inputString();
Name[csn-1]=name;
break;
case 2:
IO.output("ReEnter Address");
address=IO.inputString();
Address[csn-1]=address;
break;
case 3:
IO.output("ReEnter age");
age=IO.inputInteger();
Age[csn-1]=age;
break;
default:
IO.output("Index did not match.Try again.");
}
}
/**ENTER THE CASE PAPER NUMBER OF THE PATIENT.
 * 
 */
public void ADD_PATIENT_IMAGES(int csn)
{
    ColorImage xray=new ColorImage();
    xrays[csn-1][xraynum]=xray;
    xraynum++;
}
/**
 * ENTER THE CASE PAPER NUMBER AND XRAY-NUMBER OF PATIENT. 
 */
public void VIEW_PATIENT_IMAGES(int csn,int xraynumber)
{
    Canvas canvas=new Canvas();
    ColorImage xraytoview=xrays[csn-1][xraynumber-1];
    canvas.add(xraytoview);
}
public void GET_REPORTS()
{
    long total=0;
    for(int j=0;j<=i;j++)
    {
        System.out.println("Name:"+Name[j]);
        System.out.println("Treatment done till now:"+Treatment_Done[j]);
        System.out.println("Amount paid till now:"+Amountpaid[j]);
        total=total+Amountpaid[j];
        System.out.println();
        System.out.println();
    }
    System.out.println("TOTAL:"+total);
}
    }
        