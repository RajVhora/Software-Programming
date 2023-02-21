import java.io.*;
import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int x=scan.nextInt();
        int fact=x;
        fact=factorial(x);
        System.out.println("Factorial of Entered number is"+fact);
    }
    public static int factorial(int g){
        int r;
        if(g==1){r=1;}
        else {r=g*factorial(g-1);}
        return r;
    }
}