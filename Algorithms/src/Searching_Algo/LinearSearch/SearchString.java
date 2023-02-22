package Searching_Algo.LinearSearch;

import java.util.Arrays;

public class SearchString {
    public static void main(String[] args) {
        String name = " Rohit ";
        char target = 'o';
        System.out.println(search(name,target));
        System.out.println(Arrays.toString((name.toCharArray())));
    }
    static boolean search(String name ,char target){
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==target){
                return true;
            }
        }
        // 2nd method
        for(char ch:name.toCharArray()){
            if(ch==target) return true;
        }
        return false;
    }
}
