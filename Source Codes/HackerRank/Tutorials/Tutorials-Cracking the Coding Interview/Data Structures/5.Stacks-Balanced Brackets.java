/**
 *  ASCII codes for the required characters:
 *  { - 123
    } - 125
    [ - 91
    ] - 93
    ( - 40
    ) - 41
 */
import java.util.*;
public class HackerRankChallenges {
    public static boolean isBalanced(String exp){
        Stack<Character> ch = new Stack<Character>();
        int len = exp.length();
        if(len%2 == 1){return false;}
        else{
            for(int i=0;i<len/2;i++){ch.push(exp.charAt(i));}
            for(int i=len/2;i<len;i++){
                if(ch.lastElement() == 123 && exp.charAt(i) == 125){ch.pop();}
                else if(ch.lastElement() == 91 && exp.charAt(i) == 93){ch.pop();}
                else if(ch.lastElement() == 40 && exp.charAt(i) == 41){ch.pop();}
                else return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0;i<t;i++){
            String expression = scan.next();
            System.out.println((isBalanced(expression)) ? "YES" : "NO");
        }
    }
}
