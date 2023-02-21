package statictics;
import java.io.*;
import java.util.*;
public class Statictics{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nterms;
        double sumofweights=0,sum=0;
        System.out.println("Enter the number of Integers:");
        nterms = scan.nextInt();
        int[] integers = new int[nterms];
        int[] weights = new int[nterms];
        System.out.println("Enter the Integers:");
        for(int i=0;i<nterms;i++){
            integers[i]=scan.nextInt();
        }
        System.out.println("Enter their respective weights:");
        for(int i=0;i<nterms;i++){
            weights[i]=scan.nextInt();
            sumofweights = sumofweights + weights[i];
        }
        scan.close();
        for(int i=0;i<nterms;i++){
            sum = sum +(integers[i]*weights[i]);
        }
        double weightedmean = sum/sumofweights;
        System.out.println(weightedmean);
    }
}
