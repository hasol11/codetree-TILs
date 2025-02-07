import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A1=sc.nextInt();
        char S1=sc.next().charAt(0);
        int A2=sc.nextInt();
        char S2=sc.next().charAt(0);

        if((A1>=19&&S1=='M')||(A2>=19&&S2=='M')){
            System.out.print(0);
        }else{
            System.out.print(0);
        }
    }
}