import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();

        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n\n");
        }

        for(int i=(a-1);i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.print("\n\n");
        }
    }
}