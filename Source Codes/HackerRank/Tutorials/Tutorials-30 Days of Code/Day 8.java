import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the entries");
        int n = in.nextInt();
        Map<String, Integer> mymap;
        mymap=new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            mymap.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
	    if(mymap.containsKey(s)==true){System.out.println(s+"="+mymap.get(s));}	
	    else {System.out.println("Not found");}
        }
        in.close();
    }
}
