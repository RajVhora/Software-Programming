import java.io.*;
import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of Elements in the array:");//While submission cut this line.
        int n=scan.nextInt();
        int[] a=new int[n];
        int numberOfSwaps=0;
        for(int x=0;x<n;x++){
            int y=scan.nextInt();
            a[x]=y;
        }
        scan.close();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    numberOfSwaps++;
                }
            }
            if(numberOfSwaps==0){
                break;
            }
        }
        System.out.println("Array is sorted in "+numberOfSwaps+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);
    }
}