import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a Number with Base 10:");
        int num=scan.nextInt();
        String x=Integer.toBinaryString(num);
        int l=x.length();
        int currentbit=0;
        int num2=0;
        int max=0;
        for(int f=0;f<l;f++){
            if(x.charAt(f)==currentbit){num2++;}
            else{currentbit=x.charAt(f);num2=1;}
            max=Math.max(max,num2);
        }
        System.out.println(max);
    }}