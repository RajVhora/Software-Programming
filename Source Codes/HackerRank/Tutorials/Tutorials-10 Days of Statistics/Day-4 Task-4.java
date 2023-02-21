package statistics;
import java.io.*;
import java.util.*;
public class Statistics{
    public static void main(String[] args) {
        double perfect = 2;
        double faulty = 1;
        double probability=0.0;
        for(int i=0;i<5;i++){
            probability = probability + (Math.pow(2,i)*faulty)/(Math.pow(3,i+1));
        }
       System.out.printf("%.3f",probability);
    }
}