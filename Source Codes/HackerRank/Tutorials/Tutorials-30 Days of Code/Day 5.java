import java.math.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
public class Solution{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Integer.");
        int a=scan.nextInt();
        for (int j=1;j<=10;j++){System.out.println(a+" * "+j+" = "+a*j);}
        scan.close();
    }
}