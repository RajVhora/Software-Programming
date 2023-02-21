package hackerrank.challenges;
import java.util.*;
public class HackerRankChallenges {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double L = scan.nextInt();
        double S1 = scan.nextInt();
        double S2 = scan.nextInt();
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            double Area = scan.nextInt();
            double time = ((L*Math.sqrt(2))-Math.sqrt(Area*2))/(Math.abs(S2-S1));
            System.out.println(time);
        }
    }
}
