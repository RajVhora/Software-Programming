import java.util.*;
public class HackerrankSolutions{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int turns = scan.nextInt();
        int[] myarr = new int[n];
        for(int i=0;i<n;i++)
        {
            myarr[i] = scan.nextInt();
        }
        int[] answer = TransFormArray(myarr,turns);
        for(int i=0;i<n;i++)
        {
            System.out.print(answer[i]+" ");
        }
    }
    public static int[] TransFormArray(int[] arr,int turns){
        int len = arr.length;
        int ACTurns = turns % len;
        int[] part1 = new int[ACTurns];
        System.arraycopy(arr,0,part1,0,ACTurns);
        int[] part2 = new int[len - ACTurns];
        System.arraycopy(arr,ACTurns,part2,0,len - ACTurns);
        int[] answer = new int[len];
        System.arraycopy(part2,0,answer,0,part2.length);
        System.arraycopy(part1,0,answer,part2.length,part1.length); 
        return answer;
    }
}