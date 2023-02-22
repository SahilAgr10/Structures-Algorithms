package Searching_Algo.LinearSearch;

public class evenDigits {
    public static void main(String[] args) {
        int[] arr = {12,34,6789,87653,578389572};
        System.out.println(" Total even no. of Digits are " + evenDigit(arr));
    }
    static int evenDigit(int arr[]){
        int count =0;
        for(int i =0;i<arr.length;i++){
            if(digitIsEven(arr[i])){
                count++;
            }
        }return count;
    }
    static boolean digitIsEven(int num){
        if(even(num)%2==0) return true;
        return false;
    }
    static int even(int num){
        int count=0;
        while(num!=0){
            count++;
            num = num/10;
        }
        return count;
    }
}
