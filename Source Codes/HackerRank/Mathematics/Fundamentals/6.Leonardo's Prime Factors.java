package hackerrank.challenges;
import java.util.*;
public class HackerRankChallenges {
    private static int prime = 2;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter=0;
        long m = scan.nextLong();
        if(m==0 || m==1){
        System.out.println("0");
        }
        else{
        int product=1;
        while(product<=m){
            product = product*prime;
            counter++;
            nextPrime();
        }
        System.out.println(counter-1);
        }
    }
    public static void nextPrime(){
        int i = prime+1;
        boolean primeDetected = false;
        while(primeDetected == false){
            for(int j=2;j<i;j++){
                if(j==i-1){
                    primeDetected=true;
                    prime = i;
                    break;
                }
                if(i%j==0){break;}
            }
            i++;
        }
    }
}
