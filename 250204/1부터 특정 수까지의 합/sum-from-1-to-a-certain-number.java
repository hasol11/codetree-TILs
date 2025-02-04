import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print(cal(a));
    }
    static int cal(int a){
        int sum=0;
        for(int i=1;i<=a;i++){
            sum+=i;
        }
        int cal2=sum/10;
        return cal2;
    }
}