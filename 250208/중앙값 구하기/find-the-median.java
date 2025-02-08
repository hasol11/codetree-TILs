import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int max, mid, min =0;

        if(a>b){
            if(b>c){ //a>b>c
                System.out.print(b);
            }else{
                if(c>a){ 
                    System.out.print(a); //a>b, c>b, c>a 
                }else{
                    System.out.print(c);
                }
            }
        }else{  //b>a
            if(a>c){
                System.out.print(a);
            }else{  //b>a, c>a
                if(c>b){
                    System.out.print(b);
                }else{
                    System.out.print(c);
                }
            }
        }


    }
}