public class element{
    static void majorityElement(int[] arr){
        int count = 1;
        int majIndex = 0;
        for(int i=1 ; i<arr.length ; ++i){
            if(arr[i] == arr[majIndex]){
                count++;
            }else{
                count--;
            }
            if(count <= 0){
                count =1;
                majIndex = i;
            }
        }
        if(arr[majIndex] == count){
            System.out.println(count + " is majority");
        }else{
        System.out.println("no majority found");
        }
    }
    public static void main(String[] args){
        int[] arr = {1,1,2,3,1};
        majorityElement(arr);
    }
}