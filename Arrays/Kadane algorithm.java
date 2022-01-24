import java.io.*;
public class sum{
    static void kadane(int[] arr, int n){
            int curr_sum = 0;
            int max_sum = Integer.MIN_VALUE;
            for(int i=0 ; i<n ; ++i){
                curr_sum = curr_sum + arr[i];
                if(curr_sum > max_sum){
                    max_sum = curr_sum;
                }
                if(curr_sum < 0){
                    curr_sum = 0;
                }
            }
            System.out.print(max_sum);
        }
    public static void main(String[] args){
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadane(arr, arr.length);
    }
}