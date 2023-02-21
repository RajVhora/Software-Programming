package statistics;
import java.io.*;
import java.util.*;
public class Statistics{
    public static final double rejected=12;
    public static final double accepted=88;
    static int factorial(int n)
    {
        if(n==0)
            return 1;
        return n*factorial(n-1);
    }
    static double combination(int r){
        return (factorial(10)/(factorial(r)*factorial(10-r)));
    }
    public static void main(String[] args) {
       double p = (accepted)/(accepted + rejected);
       double q = 1-p;
       double probability = 0.0;
       for(int i=0;i<=2;i++){
           probability = probability + combination(i)*Math.pow(q, i)*Math.pow(p,10-i);
       }
       System.out.printf("%.3f",probability);
       System.out.println();
       probability = 0.0;
       for(int i=10;i>=2;i--){
           probability = probability + combination(i)*Math.pow(q, i)*Math.pow(p,10-i);
       }
       System.out.printf("%.3f",probability);
    }
}