package Recursion.PractiseQuestions;

public class PrintMessage {
    public static void main(String[] args) {
        print(1);
    }
    static void print (int num){
        if(num==6){
            return;
        } System.out.println(num);
        print(num+1);
    }
}
