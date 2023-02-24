package Searching_Algo.BinarySearch;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30},{15,25,35},{40,50,60}};
        int target = 20;
        System.out.println(search(arr,target));
    }
    static boolean search(int[][] arr,int target){
        int row = 0;
        int col = arr.length-1;
        while(row!=col){
            if(arr[row][col]==target){
                return true;
            } if(arr[row][col] > target){
                col--;
            } if(arr[row][col] < target){
                row++;
            }

        }
        return false;
    }
}
