package security;
import java.io.*;
import java.util.*;
public class Security {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String original = in.nextLine();
        int size = original.length();
        int num = Integer.parseInt(original);
        for(int i=0;i<size;i++){
            int mod=(num/(int)Math.pow(10,size-1-i))%10;
            System.out.print(Modify(mod));
        }
    }
    public static int Modify(int x){
        if(x!=9){x = x+1;}
        else{x=0;}
        return x;
    }
}
