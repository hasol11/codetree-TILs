import java.util.Scanner;
public class Main {
    public static void cal(int n,int m){
        int max=0, target=0;
        if(n>m){
            max=n;
        }else{
            max=m;
        }
        for(int i=1;i<=max;i++){
            if(n%i==0&&m%i==0){
                target=i;
            }
        }
        System.out.print(target);
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        cal(n,m);
    }
}