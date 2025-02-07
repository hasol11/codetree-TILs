import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int in=sc.nextInt();
        if(in>=3000){
            System.out.print("book");
        }else if(in>=1000){
            System.out.print("mask");
        }else if(in>=500){
            System.out.print("pen");
        }else{
            System.out.print("no");
        }
    }
}