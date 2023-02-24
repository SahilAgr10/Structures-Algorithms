package Searching_Algo.BinarySearch;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        // row and column wise sorted matrix
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 6;
        search(matrix,target);
    }
    static int[] search(int[][] matrix ,int target){
        int row = matrix.length-1;
        int col =matrix[row].length;
        if(matrix.length == 1){
//            binarySearch(matrix,row,);
        }
        return new int[]{-1,-1};
    }
    static int[] binarySearch(int[][] matrix,int row,int cStart,int cEnd,int target){
        while(cStart<=cEnd){
            int mid = cStart+(cEnd-cStart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            } if(matrix[row][mid] < target){
                cStart=mid+1;
            } else{
                cEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }

}
