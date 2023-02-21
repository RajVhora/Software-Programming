import java.io.*;
import java.util.*;
import java.math.*;
import java.text.*;
import java.util.regex.*;
public class Solution
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.println("Enter a number:");
        a=scan.nextInt();
        if (a%2==1)
        {
            System.out.println("Number is odd.So weird.");
        }
        else 
        {
            if (a<30 && a>=0)
            {
                System.out.println("Number is Even.Not weird.");
            }
            if (a>=30)
            {
                System.out.println("Number is even but a bit big.So weird.");
            }
        }
    }
}