import java.util.*;
import java.io.*;
class Calculator{
    public int power(int x,int y) throws Exception{
        if(x<0 || y<0){
            throw new Exception("n and p should be non-negative");
        }
        else{
            int ans=1;
            for(int i=1;i<=y;i++){
                ans=ans*x;
            }
            return ans;
        }
    }
}

class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of test cases:");
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int p=in.nextInt();
            Calculator myCalculator=new Calculator();
            try{
                int ans = myCalculator.power(n,p);
                System.out.println(ans);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}