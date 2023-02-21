import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double[] x,xcop = new double[num];
        double[] y,ycop = new double[num];
        for (int i = 0; i < num; i++) {
            x[i] = scan.nextDouble();
            xcop[i] = x[i];
        }
        for (int i = 0; i < num; i++) {
            y[i] = scan.nextDouble();
            ycop[i] = y[i];
        }
        scan.close();
        Arrays.sort(xcop);
        Arrays.sort(ycop);
        double diff = 0.0;
        for (int i = 0; i < num; i++) {
            diff = Math.pow((Arrays.asList(xcop).indexOf(x[i]) - Arrays.asList(ycop).indexOf(y[i])),2) + diff;
        }
        double ans = 1-((6*diff)/(num*(Math.pow(num, 2)-1)));
        System.out.println(ans);
    }
}