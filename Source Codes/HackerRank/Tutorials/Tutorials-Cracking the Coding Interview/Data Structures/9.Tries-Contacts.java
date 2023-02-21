package hackerrank;
import java.util.*;
public class HackerRank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        LinkedList<String> contacts = new LinkedList<>();
        for(int i=0;i<n;i++){
            String op = scan.next();
            String contact = scan.next();
            if(op.equals("add")){
                contacts.add(contact);
            }
            if(op.equals("find")){
                int counter =0;
                for(int j=0;j<contacts.size();j++){
                    boolean x = contacts.get(j).contains(contact);
                    if(x == true){counter++;}
                }
                System.out.println(counter);
            }
        }
    }
}
