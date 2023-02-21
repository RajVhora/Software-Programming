package hackerrank.challenges;
import java.util.*;
public class HackerRankChallenges {
    public static int lowestTriangle(int base,int area){
        return (int)Math.floor(area*2/base);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base = scan.nextInt();
        int area = scan.nextInt();
        int height = lowestTriangle(base,area);
        System.out.println(height);
    }
}
