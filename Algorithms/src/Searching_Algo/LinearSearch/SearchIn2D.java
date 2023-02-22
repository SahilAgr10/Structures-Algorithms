package Searching_Algo.LinearSearch;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr ={
                {2,4,6},
                {6,8,4},
                {-8,1,4}
        };
        System.out.println(findMin(arr));
    }
    static int findMin(int[][] arr){
        int min = Integer.MAX_VALUE;
        for(int row =0;row<arr.length;row++){
            for(int column=0;column<arr[row].length;column++){
                if(arr[row][column] < min){
                    min=arr[row][column];
                }
            }

        }
        return min;
    }
}
