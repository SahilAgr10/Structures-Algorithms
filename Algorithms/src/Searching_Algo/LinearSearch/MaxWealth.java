package Searching_Algo.LinearSearch;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {{4,5,2},{8,9,6},{7,5,3}};
        System.out.println(maxWealth(accounts));
    }

    private static int maxWealth(int[][] accounts) {
        int ans = 0;
        for(int[]account:accounts){
            int sum=0;
            for(int element:account){
                sum+=element;
            } if(sum>ans) ans=sum;
        } return ans;
    }
}
