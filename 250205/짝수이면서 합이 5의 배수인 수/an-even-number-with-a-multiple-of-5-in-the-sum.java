import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        cal(n);
    }
    static void cal(int n){
        int num1= n/10;
        int num2= n%10;
        if(n%2==0&&(num1+num2)%5==0){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}