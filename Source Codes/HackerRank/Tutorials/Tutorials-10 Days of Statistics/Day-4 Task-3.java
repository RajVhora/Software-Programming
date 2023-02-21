package statistics;
import java.io.*;
import java.util.*;
public class Statistics{
    public static void main(String[] args) {
        double perfect = 2;
        double faulty = 1;
       double probability = (Math.pow(perfect,4)*faulty)/Math.pow(3,5);
       System.out.printf("%.3f",probability);
    }
}