import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int [] arr=new int [n];


        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            arr[i]=m;
        }

        for(int j=n;j>0;j--){
            int q=arr[j-1];
            if(q%2==0){
                System.out.print(q+" ");
            }
        }
    }
}