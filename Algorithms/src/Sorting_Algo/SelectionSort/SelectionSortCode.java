package Sorting_Algo.SelectionSort;

import java.util.Arrays;

public class SelectionSortCode {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,2,8,1,4,1};
        for(int i =0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = maxIndex(arr,last);
            swap(arr, maxIndex, last);
        } System.out.println(Arrays.toString(arr));
    }
    private static void swap(int[] arr, int maxIndex, int last) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }
    private static int maxIndex(int[] arr,int last) {
        int max = 0;
        for(int i =0;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }} return max;
    }}
