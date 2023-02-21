package hackerrank.challenges;
import java.util.*;
public class HackerRankChallenges {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            int pairs = scan.nextInt();
            //Since in the worst case scenario if n socks pairs are present,let first n draws be of different colours.
            //but (n+1)th draw will definitely match a colour.Hence n+1 draws.
            System.out.println(pairs+1);
        }
    }
}
