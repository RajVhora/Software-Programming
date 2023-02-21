package statistics;
import java.util.*;
public class Statistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] X = new double[n];
        double[] Y = new double[n];
        double meanX = 0,meanY=0;
        double sum  = 0;
        for(int i=0;i<n;i++){
            X[i] = scan.nextDouble();
            sum = sum + X[i];
        }
        meanX = sum/n;
        sum = 0;
        for(int i=0;i<n;i++){
            Y[i] = scan.nextDouble();
            sum = sum + Y[i];
        }
        meanY = sum/n;
        double stddevX = calculateStddev(X,meanX);
        double stddevY = calculateStddev(Y,meanY);
        double c = 0;
        for(int i=0;i<n;i++){
            c = c + (X[i]-meanX)*(Y[i]-meanY);
        }
        System.out.println(c/(n*stddevX*stddevY));
    }
    public static double calculateStddev(double[] X,double mean){
        int nterms = X.length;
        double sqrsum=0;
        for(int i=0;i < nterms ;i++){
           sqrsum = sqrsum + Math.pow((X[i]-mean),2);
        }
        double stddev = Math.sqrt(sqrsum/nterms);
        return stddev;
    }
}
