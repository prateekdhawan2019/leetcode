public class bSearch{
    public static int binarySearch(int[] arr, int low, int high, int x){
        int mid = low + (high-low)/2;
        if(arr[mid] == x) return mid;
        if(arr[mid] > x){
            return binarySearch(arr, low, mid-1, x);
        }
        if(arr[mid] < x){
            return binarySearch(arr, mid+1, high, x);
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        System.out.println("The index is: " + binarySearch(arr, 0, arr.length-1, 3));
    } 
}   