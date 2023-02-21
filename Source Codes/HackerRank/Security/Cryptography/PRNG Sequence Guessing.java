package prng;
import java.io.*;
import java.util.*;
public class PRNG{
    private final static short RANDOMS_MAX = 1000;
    private final static short RANDOMS_LENGTH = 10;
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(byte N = scan.nextByte();N>0;--N){
            /**String[] temp = br.readLine().split(" ");
            long minSeed = Long.parseLong(temp[0]);
            long maxSeed = Long.parseLong(temp[1]);
            * */
            long[] temp = new long[10];
            for(int j=0;j<10;j++){
                temp[j] = scan.nextInt();
            }
            long minSeed = temp[0];
            long maxSeed = temp[1];
            Random r = new Random();
            long seed = guessSeed(r,minSeed,maxSeed,temp);
            for(int i=0;i < RANDOMS_LENGTH; ++i){
                System.out.println(r.nextInt(RANDOMS_MAX));
            }
        }
    }
    private static long guessSeed(Random r,long min,long max,long[] ar){
        for(long seed = min; seed<=max; ++seed){
            r.setSeed(seed);
            int i = 0;
            while(i < RANDOMS_LENGTH && r.nextInt(RANDOMS_MAX) == ar[i]){
                ++i;
            }
            if(i == RANDOMS_LENGTH){
                return seed;
            }
        }
        return -1;
    }
}
