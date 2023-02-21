import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int Maglen = scan.nextInt();
        int notlen = scan.nextInt();
        LinkedList MagList = new LinkedList<String>();
        LinkedList NoteList = new LinkedList<String>();
        for(int i=0;i<Maglen;i++){MagList.add(scan.next());}
        for(int i=0;i<notelen;i++){NoteList.add(scan.next());}
        scan.close();
        boolean checker = true;
        if(MagList.size() > NoteList.size()){System.out.println("No");}
        else{
            for (int i = 0; i < NoteList.size(); i++) {
                if (MagList.contains(NoteList.get(i))) {
                    MagList.remove(NoteList.get(i));
                    NoteList.remove(i);
                }
                else{
                    checker = false;
                    break;
                }
            }
            if(checker == true ){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}