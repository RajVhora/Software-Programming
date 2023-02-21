package statistics;
import java.io.*;
import java.util.*;
public class Statistics{
    public static void main(String[] args) {
        double mean = 2.5;
        int k = 5;
        double probability = (Math.pow(mean,k))*Math.pow(Math.E,-mean)/factorial(5);
        System.out.printf("%.3f",probability);
    }
    public static int factorial(int n){
        if(n==0)
            return 1;
        return n*factorial(n-1);
    }
}