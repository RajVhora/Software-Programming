import java.util.*;
public class Solution{
    public static int Inversions = 0;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            int m = scanner.nextInt();
            int[] Myarr = new int[m];
            for(int j=0;j<m;j++){
                Myarr[j] = scanner.nextInt(); 
            }
            for(int k=0;k<m;k++){
                for(int l=0;l<m-k-1;l++){
                    if (Myarr[l] > Myarr[l+1]) {
                        int temp = Myarr[l];
                        Myarr[l] = Myarr[t+1];
                        Myarr[t+1] = temp;
                        Inversions++;
                    }
                }
            }
        }
        int result = CountInversions(Myarr);
        System.out.println(result);
    }
    public int CountInversions(int[] Myarr){
        return Inversions;
    }
}