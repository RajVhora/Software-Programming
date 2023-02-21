import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Arithmetic
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter values of Meal cost,Tip Percent,Tax percent.");
        double mealcost=scan.nextDouble();
        int tippercent=scan.nextInt();
        int taxpercent=scan.nextInt();
        scan.close();
        int tot= tippercent+taxpercent;
        int totalcost=(int)Math.round(mealcost+(mealcost*tot/100));
        System.out.println("Total cost of meal is"+totalcost+"Dollars.");
    }
}