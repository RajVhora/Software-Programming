package statistics;
import java.util.*;
public class Statistics {
    public static void main(String[] args) {
        double[] X = {95,85,80,70,60};
        double[] Y = {85,95,70,65,70};
        double b = (5*multipliedSum(X,Y)-sum(X)*sum(Y))/(5*squaredSum(X)-sum(X)*sum(X));
        double a = (sum(Y)/5)-(b*sum(X)/5);
        double y = a + b*80;
        System.out.println(y);
    }
    public static double sum(double[] x){
        double sum=0;
        for(int i=0;i<x.length;i++){
            sum = sum + x[i];
        }
        return sum;
    }
    public static double multipliedSum(double[] x,double[] y){
        double sum = 0;
        for(int i=0;i<x.length;i++){
            sum = sum + x[i]*y[i];
        }
        return sum;
    }
    public static double squaredSum(double[] x){
        double sum = 0;
        for(int i=0;i<x.length;i++){
            sum = sum + x[i]*x[i];
        }
        return sum;
    }
}
