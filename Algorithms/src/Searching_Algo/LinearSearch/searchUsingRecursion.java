package Searching_Algo.LinearSearch;

import java.util.ArrayList;

public class searchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {3,6,8,9,9,10};
        int target = 9;
        System.out.println( search(arr,target,0));
        search1(arr,target,0);
        System.out.println(search2(arr,target,0,new ArrayList<>()));
    }
    static void search1(int[] arr,int target,int index){
        if(index==arr.length) {
            System.out.println("Not Found");
            return;
        }
        if(arr[index]==target){
            System.out.println("Found");
        }else{
            search1(arr,target,index+1);
        }
    }
    static boolean search(int[] arr,int target,int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || search(arr, target, index + 1);
    }
    static ArrayList<Integer> search2(int[] arr, int target, int index,ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        } return search2(arr, target, index+1, list);
    }
}
