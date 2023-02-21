import java.util.*;
public class cipher {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String keyword = scan.nextLine();
        keyword = NormalizeKeyword(keyword);
        LinkedList pregrp = FormPreGroupList(keyword);
        LinkedList[] Groups = FormGroups(keyword,pregrp);
        Map dictionary = FormDictionary(Groups);
        String sentence = scan.nextLine();
        DecodeAndPrint(sentence,dictionary);
        scan.close();
    }
    public static String NormalizeKeyword(String keyword) {
        char[] x = keyword.toCharArray();
        LinkedList letters = new LinkedList<Character>();
        for(int i=0;i<keyword.length();i++){
            if (letters.contains(x[i]) == false) {
                letters.add(x[i]);
            }
        }
        return letters.toString();
    }
    public static LinkedList FormPreGroupList(String keyword) {
        LinkedList x = new LinkedList<Character>();
        for(int i=0;i<26;i++){
            x.add(65+i);   // You Added only the Capitals.
        }
        for (int i = 0; i < keyword.length(); i++) {
            x.remove(keyword.charAt(i));
        }
        return x;
    }
    public static LinkedList FormGroups(String keyword,LinkedList pregrp) {
        LinkedList[] groups = new Linkedlist<>(); // This Doesn't Work.
        for (int i = 0; i < keyword.length(); i++) {
            groups[i].add(keyword.charAt(i));
        }
        for (int i = 0; i < pregrp.size(); i++) {
            groups[i % keyword.length()].add(pregrp.pop());
        }
        return groups;
    }
    public static Map FormDictionary(LinkedList[] groups) {
        Map dictionary = new HashMap<Character,Character>();
        String ref = "";
        for (int i = 0; i < groups.length; i++) {
            ref.concat(groups[i].toString());
        }
        for (int i = 0; i < 26; i++) {
            dictionary.put(65+1, ref.charAt(i));
        }
        return dictionary;
    }
    public static void DecodeAndPrint(String sentence,Map dictionary) {
        String answer = "";
        for (int i = 0; i < sentence.length(); i++) {
            if (dictionary.containsKey(sentence.charAt(i))) {
                answer = answer + dictionary.get(sentence.charAt(i));
            }
            else{
                answer = answer + sentence.charAt(i);
            }
        }
        System.out.println(answer);
    }
}