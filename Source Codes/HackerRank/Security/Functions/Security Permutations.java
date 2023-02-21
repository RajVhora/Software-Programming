package security;
import java.io.*;
import java.util.*;
public class Security {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nterms = in.nextInt();
        int[] y = new int[nterms+1];
        for(int i=0;i<nterms;i++){
            int x =in.nextInt();
            y[i+1]=x;
        }
        for(int i=0;i<nterms;i++){
            System.out.println(y[y[i+1]]);
        }
    }
}
