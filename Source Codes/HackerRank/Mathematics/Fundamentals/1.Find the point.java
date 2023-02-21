package hackerrank.challenges;
import java.util.*;
public class HackerRankChallenges {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1,x2,y1,y2,xr,yr;
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            x1 = scan.nextInt();
            y1 = scan.nextInt();
            x2 = scan.nextInt();
            y2 = scan.nextInt();
            xr = (2*x2)-x1;
            yr = (2*y2)-y1;
            System.out.println(xr+" "+yr);
        }
    }
}
