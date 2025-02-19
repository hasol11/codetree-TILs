import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [] arr = new int[10];
        int a1=sc.nextInt();
        int a2=sc.nextInt();

        arr[0]=a1;
        arr[1]=a2;

        for(int i=2;i<=9;i++){
            arr[i]=arr[i-1]+arr[i-2]*2;
        }

        for(int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }
    }
}