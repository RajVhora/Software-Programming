import java.io.*;
import java.util.*;
public class Solution{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String even="",odd="";
        System.out.println("Enter the number of test cases:");
        int n=scan.nextInt();
        for(int m=0;m<=n;m++){
            String test=scan.next();
            int length=test.length();
            for(int x=0;x<length;x++){
                if(x%2==0){odd=odd+test.charAt(x);}
                else{even=even+test.charAt(x);}
            }
            System.out.println(odd+" "+even);
            even="";
            odd="";
        }
        scan.close();
    }
}
