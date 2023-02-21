package hackerrank.challenges;
import java.util.*;
public class HackerRankChallenges {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            int people = scan.nextInt();
            //let number of people be n.Total HandShakes will be nC2 i.e. n*(n-1)/2
            System.out.println(n*(n-1)/2);
        }
    }
}
