import java.io.*;
import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of Test Cases:");
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            int test=scan.nextInt();
            for(int j=2;j<Math.sqrt(test)+1;j++){
                if(j==Math.ceil(Math.sqrt(test))){System.out.println("Prime");}
                if(test%j==0){
                    System.out.println("Not prime");
                    break;
                }
            }
        }
    }
}
