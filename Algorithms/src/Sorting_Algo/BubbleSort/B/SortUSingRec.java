package Sorting_Algo.BubbleSort.B;

import java.util.Arrays;

public class SortUSingRec {
    public static void main(String[] args) {
        int[] arr = {6,4,2,8,1};
        sort(arr,5,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int row, int col){
        if(row==0){
            return;
        }
        if(col<row-1){
            if(arr[col]>arr[col+1]){
                int temp= arr[col];
                arr[col]= arr[col+1];
                arr[col+1]=temp;
            }
            sort(arr,row,col+1);


        }else{
            sort(arr,row-1,0);


        }
    }
}
