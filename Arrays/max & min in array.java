import java.io.*;
public class maxmin{
    static void maximum(int[] arr, int n){
        int max = arr[0];
        for(int i=0 ; i<n ; ++i){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max + " is maximum");
    }
    static void minimum(int[] arr, int n){
        int min = arr[0];
        for(int i=0 ; i<n ; ++i){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min + " is minimum");
    }
    public static void main(String[] args){
        int[] arr = {5,7,2,5,9,1};
        maximum(arr, arr.length);
        minimum(arr, arr.length);
    } 
}