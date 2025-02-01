import java.util.Scanner;
public class Main {
    public static void printN(int a){
            for(int i=0;i<a;i++){
                System.out.print("12345^&*()_");
                System.out.println();
            }
            
        }

    public static void main(String[] args) {
        
        // Please write your code here.
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        printN(n);
    }
}