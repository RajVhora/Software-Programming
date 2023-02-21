package hackerrank.challenges;
import java.util.*;
public class HackerRankChallenges {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int total = 1;
        if(m%2==0 && n%2==0){total = m*n/4;}
        if(m%2==0 && n%2==1){total = (m*(n-1)/4)+m/2;}
        if(m%2==1 && n%2==0){total = (n*(m-1)/4)+n/2;}
        if(m%2==1 && n%2==1){total = ((m-1)*(n-1)/4)+((m-1)/2)+((n-1)/2)+1;}
        System.out.println(total);
    }
}
