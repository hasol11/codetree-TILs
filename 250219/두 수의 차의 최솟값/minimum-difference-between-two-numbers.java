import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        int result=4000;

        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }

        for(int j=0;j<num;j++){
            for(int k=j+1;k<num;k++){
                if(result>(arr[k]-arr[j])){
                    result=arr[k]-arr[j];
                }
            }
        }
        System.out.print(result);
    }
}