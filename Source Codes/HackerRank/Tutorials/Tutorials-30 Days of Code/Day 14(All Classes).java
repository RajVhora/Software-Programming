import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Difference {
    private int[] elements;
    public int maximumDifference;
    public Difference(int[] a){
     this.elements=a;
    }
    public void computeDifference(){
        maximumDifference=0;
        for(int i=0;i<elements.length;i++){
            for(int j=i+1;j<elements.length;j++){
                int diff=Math.abs(elements[i]-elements[j]);
                maximumDifference=Math.max(maximumDifference,diff);
            }       
        }         
    }
}

import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Elements and Elements:");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}