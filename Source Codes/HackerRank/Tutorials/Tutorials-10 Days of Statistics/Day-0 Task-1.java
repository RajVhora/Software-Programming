//Finding mean,mode and Median.
import java.io.*;
import java.util.*;
public class Solution{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nterms,mode;
        double mean,median,sum = 0;
        System.out.println("Enter the number of terms:");
        nterms = scan.nextInt();
        int[] terms = new int[nterms];
        System.out.println("Enter the terms :");
        for(int i=0;i < nterms ;i++){
            terms[i] = scan.nextInt();
            sum = sum + terms[i]; //For Mean.
        }
        mean = (double)sum/nterms;
        System.out.println(mean);
        //Median
        terms = ArrangeArray(terms);
        if(nterms%2==0){
            median = (double) ((terms[(nterms)/2]+terms[(nterms/2)-1])/ 2.0);
        }
        else {
            median = terms[(nterms+1)/2-1];
        }
        System.out.println(median);
        //Mode
        LinkedList seg = new LinkedList<Integer>();
        LinkedList apperances = new LinkedList<Integer>();
        seg.addFirst(terms[0]);
        apperances.add(1);
        for(int i=1;i<nterms;i++){
            if(terms[i]==(int)seg.getLast()){
                apperances.add((int)apperances.removeLast()+1);
            }
            else {
                seg.add((int)terms[i]);
                apperances.add(1);
            }
        }
        mode = (int)seg.get(max(apperances));
        System.out.println(mode);
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
    public static int max(LinkedList<Integer> link){
        int max = link.getFirst();
        int occuredat =0;
        for(int i=0;i<link.size()-1;i++){
            if(link.get(i+1)>max){
                occuredat=i+1;
                max=link.get(i+1);
            }
        }
        return occuredat;
    }
}
