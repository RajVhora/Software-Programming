package solution;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of test cases:");
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            LinkedList<Integer> arr=new LinkedList<>();
            for(int b=2;b<=n;b++){
                for(int a=1;a<b;a++){
                    int x=a&b;
                    if(x<k){arr.add(x);}
                }
            }
            int max=-1;
            for(int y=0;y<arr.size();y++){
                max=Math.max(max,arr.pop());
            }
            System.out.println(max);
        }
    }
    
}
