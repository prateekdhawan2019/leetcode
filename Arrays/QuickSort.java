public class QuickSort{
    static int partition(int[] arr, int l, int h){
        int pivot = arr[l];
        int i = l;
        int j = h;
        while(i<j){
            while(arr[i] <= pivot) i++;
            while(arr[j] > pivot) j--;
            if(i<j){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            } 
        }
        int p = arr[j];
        arr[j] = arr[l];
        arr[l] = p;
        return j;
    }
    static void sort(int[] arr, int l, int h){
        if(l < h){
            int pivot = partition(arr, l, h);
            sort(arr, l, pivot-1);
            sort(arr, pivot+1, h);
        }
    }
    static void printArray(int[] arr){
        for(int i=0 ; i<arr.length ; ++i){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        System.out.println("Given array: ");
        printArray(arr);
        sort(arr, 0, arr.length-1);
        System.out.println("Sorted array is: ");
        printArray(arr);
    }
}