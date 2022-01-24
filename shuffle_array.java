import java.util.*;
public class shuffle_array{
    static int[] shuffle(int[] arr, int n){
        int[] arr1 = new int[2*n];
        int j=0;
        for(int i=0 ; i<arr1.length ; i+=2){
            arr1[i] = arr[j];
            arr1[i+1] = arr[j+n];
            ++j;
        }
        return arr1;
    }
    public static void main(String[] args){
        int[] arr = {2,5,1,3,4,7};
        int n = 3; 
        System.out.println(Arrays.toString(shuffle(arr, n)));
    }
}