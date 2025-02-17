import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int add=0;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=(i+add);j++){
                System.out.print("*");
            }
            add++;
            System.out.println();
        }
    }
}