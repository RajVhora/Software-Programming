package statistics;
import java.io.*;
import java.util.*;
public class Statistics{
    public static void main(String[] args) {
       double meanA = 0.88;
       double meanB = 1.55;
       double CostA = 160 + 40*(meanA + meanA*meanA);
       double CostB = 128 + 40*(meanB + meanB*meanB);
       System.out.printf("%.3f",CostA);
       System.out.println();
       System.out.printf("%.3f",CostB);
    }
}