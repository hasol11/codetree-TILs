import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //나머지를 담는 배열 [10] -> 1~9까지 담는 것.
        //나눠지는 수 a, 나누는 수 b
        //나눠지는 수는 몫 나올 때마다 그 값 넣기
        Scanner sc =new Scanner(System.in); 
        int sum=0;
        int arr[]=new int [10];
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        while(a>0){
            arr[a%b]++;
            a/=b;
        }

        for(int i=0;i<10;i++){
            sum+=arr[i]*arr[i];
        }

        System.out.print(sum);
    }
}