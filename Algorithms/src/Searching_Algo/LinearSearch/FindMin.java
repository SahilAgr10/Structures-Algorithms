package Searching_Algo.LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr={1,4,2,7,-1,9};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]<min) min = arr[i];

        }
        return min;
    }
}
