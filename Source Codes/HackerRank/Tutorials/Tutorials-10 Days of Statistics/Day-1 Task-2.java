import java.io.*;
import java.util.*;
public class Statistics{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nterms;
        double Q1,Q3,IQR;
        System.out.println("Enter the number of terms:");
        nterms = scan.nextInt();
        int[] terms = new int[nterms];
        int[] freq = new int[nterms];
        System.out.println("Enter the terms :");
        for(int i=0;i < nterms ;i++){
            terms[i] = scan.nextInt();
        }
        System.out.println("Enter the Frequencies :");
        for(int i=0;i < nterms ;i++){
            freq[i] = scan.nextInt();
        }
        int cpynterms=nterms;//for first use;
        nterms=0;
        for(int i=0;i < cpynterms ;i++){
            nterms=nterms+freq[i];
        }
        int[] superset = new int[nterms];
        int counter = 0;
        for(int i=0;i<terms.length;i++){
            for(int j=0;j<freq[i];j++){
                superset[counter]=terms[i];
                counter++;
            }
        }
        superset = ArrangeArray(superset);
        if(nterms%2==0){
            int[] ArrQ1 = new int[nterms/2];
            int[] ArrQ2 = new int[nterms/2];
            for(int i=0;i<nterms/2;i++){
                ArrQ1[i]=superset[i];
            }
            for(int i = nterms/2;i<nterms;i++){
                ArrQ2[i-nterms/2]=superset[i];
            }
            Q1=CalculateMedian(ArrQ1);
            Q3=CalculateMedian(ArrQ2);
        }
        else{
            int[] ArrQ1 = new int[(nterms-1)/2];
            int[] ArrQ2 = new int[(nterms-1)/2];
            for(int i=0;i<(nterms-1)/2;i++){
                ArrQ1[i]=superset[i];
            }
            for(int i = (nterms+1)/2;i<nterms;i++){
                ArrQ2[i-(nterms+1)/2]=superset[i];
            }
            Q1=CalculateMedian(ArrQ1);
            Q3=CalculateMedian(ArrQ2);
        }
        IQR = Q3 - Q1;
        System.out.println(IQR);
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
    public static double CalculateMedian(int[] myarr){
        int nterms = myarr.length;
        double median;
        if(nterms%2==0){
            median = ((myarr[(nterms)/2]+myarr[(nterms/2)-1])/ 2.0);
        }
        else {
            median = myarr[(nterms+1)/2-1];
        }
        return median;
    }
}