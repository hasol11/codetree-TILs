import java.util.Scanner;


public class Main {

    public static void rac(int n){
    int b=1;
    for(int i=0; i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(b+" ");
            if(b==9){
                b=0;
            }
            b++;
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        rac(a);
    }
}