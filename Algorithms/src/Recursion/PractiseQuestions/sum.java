package Recursion.PractiseQuestions;

public class sum {
    public static void main(String[] args) {
        System.out.println(addAll(4));
    }
    static int addAll(int n){
        if(n==1){
            return 1;
        }
        return n+addAll(n-1);
    }
}
