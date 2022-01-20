import java.io.*;
public class reverse{
    static void reverse(int[] arr, int n){
        int[] arr1 = new int[n];
        int j = n;
        for(int i=0 ; i<n ; ++i){
            arr1[j-1] = arr[i];
            j--;
        }
        System.out.println("Reverse array: ");
        for(int k=0 ; k<n ; ++k){
            System.out.println(arr1[k]);
        }
    }
    public static void main(String[] args){
        int[] arr = {5,8,2,4,9,1};
        reverse(arr, arr.length);
    }
}
