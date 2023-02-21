package hackerrank;
import java.util.*;
public class HackerRank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float median;
        int nmterms = scan.nextInt();
        int[] arr = new int[nmterms];
        for(int i = 0;i<nmterms;i++){
            arr[i] = scan.nextInt();
            int[] terms = new int[i+1];
            for(int j=0;j<=i;j++){
                terms[j] = arr[j];
            }
            int nterms = terms.length;
            terms = ArrangeArray(terms);
            if(nterms%2==0){
                median = (float) ((terms[(nterms)/2]+terms[(nterms/2)-1])/ 2.0);
            }
            else {
                median = terms[(nterms+1)/2-1];
            }
            System.out.println(median);
        }
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
}
