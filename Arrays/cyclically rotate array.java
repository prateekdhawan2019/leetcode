import java.io.*;
public class rotate{
    static void cycle(int[] arr, int n){
        int x = arr[n-1];
        for(int i=n-1 ; i>0 ; --i){
            arr[i] = arr[i-1];
        }
        arr[0] = x;
        for(int i=0 ; i<n ; ++i){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        cycle(arr, arr.length);
    }   
}