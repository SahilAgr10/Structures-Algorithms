package Sorting_Algo.InsertionSort;

import java.util.Arrays;

public class insertionSortCode {
    public static void main(String[] args) {
        int[] arr = {1,4,7,5,67,7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        for(int i =0;i<arr.length-1;i++){
            for(int j = i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                } else{
                    break;
                }
            }
        }
    }

}
