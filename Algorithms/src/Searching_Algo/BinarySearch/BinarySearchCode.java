package Searching_Algo.BinarySearch;

public class BinarySearchCode {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,10};
        int target = 39;
        System.out.println(search(arr,target));;
    }

    private static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid =  start + (end - start) / 2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                start= mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return Integer.MAX_VALUE;
    }
}
