package security;
import java.io.*;
import java.util.*;
public class Security {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nterms = in.nextInt();
        int[] x = new int[nterms];
        int[] y = new int[nterms];
        for(int i=0;i<nterms;i++){
            int z =in.nextInt();
            x[i]=i+1;
            y[i]=z;
        }
        //get i for the particular value of y and then return the corresponding value of x at ith position.
        for(int i=0;i<nterms;i++){
            for(int j=0;j<nterms;j++){
                if(y[i]==x[j]){
                    System.out.println(y[x[j]-1]);
                }
            }
        }
    }
}
