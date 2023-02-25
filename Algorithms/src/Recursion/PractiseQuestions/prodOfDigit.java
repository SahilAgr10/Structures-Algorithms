package Recursion.PractiseQuestions;

public class prodOfDigit {
    public static void main(String[] args) {
        System.out.println(prod(541));
    }
    static int prod(int num){
        if(num%10==num) {
            return 1;
        }
            return num%10 * prod(num/10);
    }
}
