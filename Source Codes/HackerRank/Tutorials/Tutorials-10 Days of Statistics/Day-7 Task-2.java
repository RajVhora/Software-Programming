package statistics;
import java.util.*;
public class Statistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] X = new double[n];
        double[] Y = new double[n];
        for(int i=0;i<n;i++){
            X[i] = scan.nextDouble();
        }
        for(int i=0;i<n;i++){
            Y[i] = scan.nextDouble();
        }
        double c = 0;
        for(int i=0;i<n;i++){
            c = c + Math.pow((X[i])-(Y[i]),2);
        }
        double r = 1 - (6*c/(n*(n*n-1)));
        System.out.println(r);
    }
}
