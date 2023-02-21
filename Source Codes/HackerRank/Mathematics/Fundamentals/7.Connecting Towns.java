package hackerrank.challenges;
import java.util.*;
public class HackerRankChallenges {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            int product = 1;
            int towns = scan.nextInt();
            for(int j=1;j<towns;j++){product = product*scan.nextInt();}
            System.out.println(product%1234567);
        }
    }
}
