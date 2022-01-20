public class smallest{
    static int subarray(int[] arr, int n, int x){
        int min_len = n;
        for(int i=0 ; i<n ; ++i){
            int curr_sum = arr[i];
            if(curr_sum>x){
                return 1;
            }
            for(int j=i+1 ; j<n ; ++j){
                curr_sum += arr[j];
                if(curr_sum>x && (j-i+1)<min_len){
                    min_len = j-i+1;
                }
            }
        }
        return min_len;
    }
    public static void main(String[] args){
        int[] arr = {1, 4, 45, 6, 0, 19};
        int x = 51;
        System.out.print(subarray(arr, arr.length, x));
    }
}