import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //3 0 3 n --1 씩 i=3
        //2 2 2 i=2 (n-i)*2
        //1 4 1 i=1 

        //4 0 4
        //3 2 3
        //2 4 2
        //1 6 1 
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            for(int k=(n-i)*2;k>0;k--){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}