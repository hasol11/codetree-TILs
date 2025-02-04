import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        cal(a,b,c);
    }
    public static void cal(int a, int b, int c){
        int min=0;
        if(a>b){
            if(b>c){
                min=c;
            }else{
                min=b;
            }
        }else{
            if(a>c){
                min=c;
            }else{
                min=a;
            }
        }
        System.out.print(min);
    }
}