package Recursion.PractiseQuestions;

public class fibonaci {
    public static void main(String[] args) {
        System.out.println(fib(6));
        //0,1,1,2,3,5,8
    }

    private static int fib(int num) {
        if(num<2){
            return num;
        }

        return fib(num-1)+fib(num-2);

    }
}
