import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.println("*");
            }
            else if(i%2==0){ // 1 2 // 3 4 // 5 6
                for(int j=0;j<i;j++){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
        }
    }
}