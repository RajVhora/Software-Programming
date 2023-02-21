package statistics;
import java.io.*;
import java.util.*;
public class Statistics{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nterms,median;
        int Q1,Q2,Q3;
        System.out.println("Enter the number of terms:");
        nterms = scan.nextInt();
        int[] terms = new int[nterms];
        System.out.println("Enter the terms :");
        for(int i=0;i < nterms ;i++){
            terms[i] = scan.nextInt();
        }
        terms = ArrangeArray(terms);
        Q2=CalculateMedian(terms);
        if(nterms%2==0){
            int[] ArrQ1 = new int[nterms/2];
            int[] ArrQ2 = new int[nterms/2];
            for(int i=0;i<nterms/2;i++){
                ArrQ1[i]=terms[i];
            }
            for(int i = nterms/2;i<nterms;i++){
                ArrQ2[i-nterms/2]=terms[i];
            }
            Q1=CalculateMedian(ArrQ1);
            Q3=CalculateMedian(ArrQ2);
        }
        else{
            int[] ArrQ1 = new int[(nterms-1)/2];
            int[] ArrQ2 = new int[(nterms-1)/2];
            for(int i=0;i<(nterms-1)/2;i++){
                ArrQ1[i]=terms[i];
            }
            for(int i = (nterms+1)/2;i<nterms;i++){
                ArrQ2[i-(nterms+1)/2]=terms[i];
            }
            Q1=CalculateMedian(ArrQ1);
            Q3=CalculateMedian(ArrQ2);
        }
        System.out.println(Q1+"\n"+Q2+"\n"+Q3);
    }
    public static int[] ArrangeArray(int[] myarr){
        int terms = myarr.length;
        for(int i=0;i< terms;i++){
            for(int j=0;j<terms-1;j++){
                int temp;
                if(myarr[j]>myarr[j+1]){
                    temp = myarr[j];
                    myarr[j]=myarr[j+1];
                    myarr[j+1]=temp;
                }
            }
        }
        return myarr;
    }
    public static int CalculateMedian(int[] myarr){
        int nterms = myarr.length;
        int median;
        if(nterms%2==0){
            median = ((myarr[(nterms)/2]+myarr[(nterms/2)-1])/ 2);
        }
        else {
            median = myarr[(nterms+1)/2-1];
        }
        return median;
    }
}