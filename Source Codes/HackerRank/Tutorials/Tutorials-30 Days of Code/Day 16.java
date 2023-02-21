import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Print a String.");
        String S=in.next();
        int ns;
        try{
            ns=Integer.parseInt(S);
            System.out.println(ns);
        }
        catch(Exception e){
            System.out.println("Bad String");
        }
        in.close();
    }
}
        