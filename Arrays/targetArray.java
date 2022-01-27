public class targetArray{
    public static void target(int[] arr, int target){
        int low = 0;
        int high = 1;
        for(int i=1 ; ; ++i){
            while(arr[i] < target){
                low = high;
                high = 2 * high;
            }
        }
        return binarySearch(arr, low, high, target);
    }
    public static int binarySearch(int[] arr, int low, int high, int target){
        for(int i=low ; i<=high ; ++i){
            if(arr[i] == target){
                System.out.println("Target found at " + i);
            }
        }
        System.out.println("Target not found");
    }
    public static void main(String[] args){
        int[] arr = {1,5,3,8,14,26,39,42,56,91,98};
        target(arr, 42);
    }
}