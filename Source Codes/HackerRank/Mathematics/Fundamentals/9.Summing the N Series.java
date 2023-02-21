package hackerrank.challenges;
import java.util.*;
public class HackerRankChallenges {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double modular = Math.pow(10,9)+7;
        for(int i=0;i<n;i++){
            int sum = 0;
            int lastt = scan.nextInt();
            for(int j=0;j<lastt;j++){
                sum = sum + ((2*j)+1);
            }
            System.out.println(sum % modular);
        }
    }
}
