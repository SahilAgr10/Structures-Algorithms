import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int size = sc.nextInt();
            int[] arr1= new int[size];
            int[] arr2= new int[size];
            int count = 0;
            for(int i = 0;i<size;i++){
                arr1[i]=sc.nextInt();
            }
            for(int j = 0;j<size;j++){
                arr2[j]=sc.nextInt();
            }
            for(int l = 1;l<size;l++){
                if(arr1[l]-arr1[l-1] <= arr2[l]){
                    count++;
                }
            }System.out.println(count+1);
        }
    }
}