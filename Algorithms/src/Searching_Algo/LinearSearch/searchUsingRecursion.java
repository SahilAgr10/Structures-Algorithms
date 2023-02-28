package Searching_Algo.LinearSearch;

public class searchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {3,6,8,9,10};
        int target = 9;
        System.out.println( search(arr,target,0));
    }
    static void search1(int[] arr,int target,int index){
        if(index==arr.length) {
            System.out.println("Not Found");
            return;
        }
        if(arr[index]==target){
            System.out.println("Found");
            return;
        }else{
            search(arr,target,index+1);
        }
    }
    static boolean search(int[] arr,int target,int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || search(arr, target, index + 1);
    }
}
