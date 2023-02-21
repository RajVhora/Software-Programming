package statistics;
import java.io.*;
import java.util.*;
public class Statistics{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nterms,sum=0;
        System.out.println("Enter the number of terms:");
        nterms = scan.nextInt();
        int[] terms = new int[nterms];
        System.out.println("Enter the terms :");
        for(int i=0;i < nterms ;i++){
            terms[i] = scan.nextInt();
            sum = sum +terms[i];
        }
        double mean = sum/nterms;
        double sqrsum=0;
        for(int i=0;i < nterms ;i++){
           sqrsum = sqrsum + Math.pow((terms[i]-mean),2);
        }
        double stddev = Math.sqrt(sqrsum/nterms);
        System.out.printf("%.1f",stddev);
    }
}