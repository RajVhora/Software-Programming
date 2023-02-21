package security;
import java.io.*;
import java.util.*;
import java.math.*;
import java.text.*;
import java.util.regex.*;
public class Security {
    static int calculate(int x){
        int result = x%11;
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int result = calculate(x);
        System.out.println(result);
        in.close();
    }
}
