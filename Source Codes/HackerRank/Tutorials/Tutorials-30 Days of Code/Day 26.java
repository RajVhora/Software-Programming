package solution;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int actday,actmon,actyear;
        int expday,expmon,expyear;
        System.out.println("Enter Dates:");
        Scanner sc =new Scanner(System.in);
        actday=sc.nextInt();
        actmon=sc.nextInt();
        actyear=sc.nextInt();
        expday=sc.nextInt();
        expmon=sc.nextInt();
        expyear=sc.nextInt();
        int fine=0;
        if(expyear<actyear){fine=10000;}
        if(expyear==actyear){
            if(expmon<actmon){fine=(actmon-expmon)*500;}
            if(expmon==actmon && expday<actday){
                fine=(actday-expday)*15;
            }
        }
        System.out.println(fine);
    }
    
}
