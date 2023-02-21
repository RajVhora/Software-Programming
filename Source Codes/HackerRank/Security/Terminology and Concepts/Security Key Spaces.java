package security;
import java.io.*;
import java.util.*;
public class Security {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String original = in.nextLine();
        int shiftkey = in.nextInt();
        int size = original.length();
        int num = Integer.parseInt(original);
        for(int i=0;i<size;i++){
            int mod=(num/(int)Math.pow(10,size-1-i))%10;
            System.out.print(Modify(mod,shiftkey));
        }
    }
    public static int Modify(int x,int shiftkey){
        x=(x+shiftkey)%10;
        return x;
    }
}
