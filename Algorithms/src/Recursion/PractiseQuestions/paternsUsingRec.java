package Recursion.PractiseQuestions;

public class paternsUsingRec {
    public static void main(String[] args) {
        pattern(5,0);//triangle rev pattern
        System.out.println();
        pattern2(5,0);// triangle straight pattern
    }
    static void pattern(int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            pattern(row,col+1);
            System.out.print("*");

        }else{
            pattern(row-1,0);
            System.out.println();

        }
    }

    static void pattern2(int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            System.out.print("*");
            pattern2(row,col+1);
        }else{
            System.out.println();
            pattern2(row-1,0);


        }
    }
}
