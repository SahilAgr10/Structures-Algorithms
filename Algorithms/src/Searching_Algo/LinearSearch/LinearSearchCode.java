package Searching_Algo.LinearSearch;

public class LinearSearchCode {
    public static void main(String[] args) {
        int[] arr = {1,5,3,6,8,3};
        int target = 39;
        search(arr,target);
    }

    private static void search(int[] arr , int target) {
        if(arr[arr.length-1]!=target){
            System.out.println("Not exist");
        }
        for(int element:arr){
            if(element==target){
                System.out.println("Target element exist");
                break;
            }
        }
    }
}
