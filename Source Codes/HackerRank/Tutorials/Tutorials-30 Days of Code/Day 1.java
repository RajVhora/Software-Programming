import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution
{
    public static void main(String[] args)
    {
        int i=4;
        double d=4.0;
        String s="HackerRank ";
        System.out.println();
        Scanner scan = new Scanner(System.in);
        int y=scan.nextInt();
        double p=scan.nextDouble();
	    scan.nextLine();
	    String x =scan.nextLine();
        System.out.println(i+y);
        System.out.println(d+p);
        System.out.println(s+x);
        scan.close();
    }
}
