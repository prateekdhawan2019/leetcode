import java.io.*;
class maxminArray{
    public static void maxmin(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0 ; i<arr.length ; ++i){
            if(max < arr[i]) max = arr[i];
            if(min > arr[i]) min = arr[i];
        }
        System.out.println("Max is: " + max + "\nMin is: " + min);
    }
    public static void main(String[] args){
        int[] arr = {5,7,2,5,9,1};
        maxmin(arr);
    }
}
