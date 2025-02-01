import java.util.Scanner;
public class Main {
    public static void cal(int n, int m){
        int min=100;
        for (int i=1;i<=100;i++){
            for(int j=1;j<100;j++){
                //값이 같아야하고, 곱하기해서 나온 값중에 작아야 해 
                if(m*j==i*n&&min>m*j){
                    min=m*j;
                }
            }
        }
        System.out.print(min);
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        cal(n,m);
    }
}