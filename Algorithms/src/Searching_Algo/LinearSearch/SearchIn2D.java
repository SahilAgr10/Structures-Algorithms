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
        for (int[] ints : arr) {
            for (int element :ints) {
                if (element < min) {
                    min = element;
                }
            }
        }
        return min;
    }
}
