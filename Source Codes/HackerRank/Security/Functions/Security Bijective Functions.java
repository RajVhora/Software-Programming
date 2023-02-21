package security;
import java.io.*;
import java.util.*;
public class Security {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nterms = in.nextInt();
        int decider = 1;
        int[] y = new int[nterms];
        for(int i=0;i<nterms;i++){
            y[i] = in.nextInt();
        }
        //test for one-one
        for(int i=0;i<nterms;i++){
            for(int j=0;j<nterms;j++){
                if(i!=j && y[j]==y[i]){
                    decider=0;
                }
        }
        }
        if(decider==1){
            System.out.println("YES");
        }
        else {System.out.println("NO");}
    }
}
