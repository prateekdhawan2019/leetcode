import java.io.*;
public class sum{
    static void removeDuplicate(int[] arr, int n){
        int j=1;
        for(int i=0 ; i<n-1 ; ++i){
            if(arr[i] != arr[i+1]){
                arr[j] = arr[i+1];
                ++j;
            }
        }
        System.out.print(j);
    }
    public static void main(String[] args){
        int[] arr = {1,1,2,3,4,5,6,6};
        removeDuplicate(arr, arr.length);
    }
}