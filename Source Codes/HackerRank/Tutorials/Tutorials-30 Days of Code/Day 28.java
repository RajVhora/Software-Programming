package solution;
import java.io.*;
import java.util.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex="[a-z]+@gmail.com";
        Pattern p=Pattern.compile(regex);
        System.out.println("Enter the number of emailsIds:");
        int n=sc.nextInt();
        LinkedList<String> sorted = new LinkedList<>();
        for(int i=0;i<n;i++){
            String firstname=sc.next();
            String emailId=sc.next();
            Matcher m =p.matcher(emailId);
            if(m.find()){
                sorted.add(firstname);
            }
        }
        Collections.sort(sorted);
        for(int j=0;j<sorted.size();j++){System.out.println(sorted.pop());}
    }
    
}
