import java.io.*;
import java.util.*;
class cyclicallyRotate{
    public static void reverse(int[] arr, int n){
        int[] b = new int[n];
        b[0] = arr[n-1];
        for(int i=0 ; i<n-1 ; ++i){
            b[i+1] = arr[i]; 
        }
        for(int k=0 ; k<n ; ++k){
            System.out.print(b[k] + " ");
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        reverse(arr, arr.length);
    }
}
