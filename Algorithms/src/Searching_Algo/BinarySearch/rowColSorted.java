package Searching_Algo.BinarySearch;

import java.util.Arrays;

public class rowColSorted {
    public static void main(String[] args) {
        // row and column wise sorted matrix
        int[][] arr = {{10,20,30},{15,25,35},{40,50,60}};
        int target = 60;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][] arr,int target){
        int row = 0;
        int col = arr.length-1;
        while(row< arr.length && col > 0){
            if(arr[row][col]==target){
                return new int[]{row,col};
            } if(arr[row][col] > target){
                col--;
            } if(arr[row][col] < target){
                row++;
            }} return new int[]{-1,-1};
    }
}
