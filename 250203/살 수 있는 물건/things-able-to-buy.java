import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<1000){
            System.out.print("no");
        }else if(a<3000){
            System.out.print("mask");
        }else{
            System.out.print("book");
        }
    }
}