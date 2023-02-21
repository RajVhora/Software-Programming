import java.util.*;
public class MergeSort {
    public static int[] array = new int[n];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//number of elements
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        mergeSort(array);
        System.out.print(array);
    }
    public static void mergeSort(int[] array) {
        mergesort(array,new int[array.length],0,array.length-1);
    }
    public static void mergesort(int[] array,int[] temp,int leftstart,int rightend) {
        if (leftstart >= rightend) {
            return;
        }
        int middle = (leftstart + rightend)/2;
        mergesort(array, temp, leftstart, middle);
        mergesort(array, temp, middle, rightend);
        mergehalves(array,temp,leftstart,rightend);
    }
    public static void mergehalves(int[] array,int[] temp,int leftstart,int rightend) {
        int leftend = (rightend+leftstart)/2;
        int rightstart = leftend +1;
        int size = rightend - leftstart +1;
        int left = leftstart;
        int right = rightstart;
        int index = leftstart;
        while (left <= leftend && right <= rightend) {
            if(array[left] <= array[right]){
                temp[index] = array[left];
                left++;
            }
            else{
                temp[index] = array[right];
                right++;
            }
            index++;
        }
        System.arraycopy(array, left, temp, index, leftend-left+1);
        System.arraycopy(array, right, temp, index, rightend-right+1);
        System.arraycopy(temp, leftstart, array, leftstart, size);
    }
}