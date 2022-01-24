import java.io.*;
public class negative{
    static void neg(int[] arr, int n){
        int i=-1, temp;
        for(int j=0 ; j<n; ++j){
            if(arr[j]<0){
                ++i;
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        for(int j=0 ; j<n ; ++j){
            System.out.print(arr[j] + " ");
        } 
    }
    public static void main(String[] args){
        int[] arr = {8,-6,9,-5,3,2};
        neg(arr, arr.length);
    } 
}