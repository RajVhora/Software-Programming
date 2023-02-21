import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import comp102x.IO;
public class CrossWordSolver{
	private static int i,j;
	private static List<String> resultword =new ArrayList<String>();
	private static List<Integer> resultx =new ArrayList<Integer>();
	private static List<Integer> resulty =new ArrayList<Integer>();
	private static List<Integer> resultdirec =new ArrayList<Integer>();
	private static int resultno=1;
	private static List<String> wordstofind =new ArrayList<String>();
	private int wordcounter=0;
    public  void readandformarray() throws IOException{
        File inputFile1=new File("CrossWord Words.txt");
        Scanner input1=new Scanner(inputFile1);
        while( input1.hasNext()) {
            String word=input1.next();
			wordstofind.add(word);
			this.wordcounter++;
        }
        input1.close();
    }
    public  char[][] readCrossWord(){
        Scanner scan1=new Scanner(System.in);
        System.out.println("Enter the length and Breadth of CrossWord Array respectively:");
        i=scan1.nextInt();
        j=scan1.nextInt();
        char[][] CrossWord=new char[i][j];
        for(int a=0;a<i;a++){
            for(int b=0;b<j;b++){
                char c=IO.inputCharacter();
                CrossWord[a][b]=c;
            }
        }
        return CrossWord;
    }
	public  void Searchandformresult(String word,char[][] CrossWord,int x,int y){
		int wordlength=word.length();
		int x1=x;
		int y1=y;
		String word1=word;//copies if required
		if(y+wordlength<=j){
			loop1:for(int r=1;r<=wordlength;r++){
				if(r==wordlength){
					SendResults(word,x,y,"Loop 1");
					resultno++;
					break loop1;
				}
				if(word1.charAt(r)==CrossWord[x][y1+1]){y1++;}
				else {break loop1;}
			}
			y1=y;
		}
		if(y+wordlength<=j && x+1>=wordlength ){
			loop2:for(int r=1;r<=wordlength;r++){
				if(r==wordlength){
					SendResults(word,x,y,"Loop 2");
					resultno++;
					break loop2;
				}
				if(word1.charAt(r)==CrossWord[x1-1][y1+1]){y1++;x1--;}
				else {break loop2;}
			}
			y1=y;x1=x;
			}
		if(x+1>=wordlength ){
			loop3:for(int r=1;r<=wordlength;r++){
				if(r==wordlength){
					SendResults(word,x,y,"Loop 3");resultno++;
					break loop3;
				}
				if(word1.charAt(r)==CrossWord[x1-1][y1]){x1--;}
				else {break loop3;}
			}
			x1=x;
			}
		if(x+1>=wordlength && y+1>=wordlength ){
			loop4:for(int r=1;r<=wordlength;r++){
				if(r==wordlength){
					SendResults(word,x,y,"Loop 4");resultno++;
					break loop4;
				}
				if(word1.charAt(r)==CrossWord[x1-1][y1-1]){x1--;y1--;}
				else {break loop4;}
			}
			x1=x;y1=y;
			}
		if(y+1>wordlength){
			loop5:for(int r=1;r<=wordlength;r++){
				if(r==wordlength){
					SendResults(word,x,y,"Loop 5");resultno++;
					break loop5;
				}
				if(word1.charAt(r)==CrossWord[x][y1-1]){y1--;}
				else {break loop5;}
			}
			y1=y;
		}
		if(y+1>wordlength && x+wordlength<=i){
			loop6:for(int r=1;r<=wordlength;r++){
				if(r==wordlength){
					SendResults(word,x,y,"Loop 6");resultno++;
					break loop6;
				}
				if(word1.charAt(r)==CrossWord[x1+1][y1-1]){y1--;x1++;}
				else {break loop6;}
			}
			y1=y;x1++;
		}
		if(x+wordlength<=i){
			loop7:for(int r=1;r<=wordlength;r++){
				if(r==wordlength){
					SendResults(word,x,y,"Loop 7");resultno++;
					break loop7;
				}
				if(word1.charAt(r)==CrossWord[x1+1][y1]){x1++;}
				else {break loop7;}
			}
			x1=x;
			}
		if(y+wordlength<=j && x+wordlength<=i){
			loop8:for(int r=1;r<=wordlength;r++){
				if(r==wordlength){
					SendResults(word,x,y,"Loop 8");resultno++;
					break loop8;
				}
				if(word1.charAt(r)==CrossWord[x1+1][y1+1]){y1++;x1++;}
				else {break loop8;}
			}
			y1=y;x1=x;
		}
	}
	public  void SendResults(String word,int x,int y,String loopno){
		resultword.add(word);
		resultx.add(x);
		resulty.add(y);
		int direc=0;
		if(loopno.equals("Loop 1")){direc=0;}
		if(loopno.equals("Loop 2")){direc=45;}
		if(loopno.equals("Loop 3")){direc=90;}
		if(loopno.equals("Loop 4")){direc=135;}
		if(loopno.equals("Loop 5")){direc=180;}
		if(loopno.equals("Loop 6")){direc=225;}
		if(loopno.equals("Loop 7")){direc=270;}
		if(loopno.equals("Loop 8")){direc=325;}
		resultdirec.add(direc);
	}
    public void main(String[] args) throws IOException
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Complete the .txt document in file containing CrossWordSolver file.Write the names of words to be found in Block letters.");
        System.out.println("If not completed complete it and restart program.");
		readandformarray();
        System.out.println("Enter the crossword array :");
        char[][] CrossWord=readCrossWord();
		for(int w=0;w<wordcounter;w++){	
			for(int x=0;x<i;x++){
				for(int y=0;y<j;y++)
				{
					if(CrossWord[x][y]==wordstofind.get(w).charAt(0)){Searchandformresult(wordstofind.get(w),CrossWord,x,y);}
				}
			}
		}
		for(int h=0;h<wordcounter;h++){System.out.println("Word Found:"+resultword.get(h)+"\nX-position:"+resultx.get(h)+"\nY-position:"+resulty.get(h)+"\nDirection:"+resultdirec.get(h)+"degrees");}
    }
}
