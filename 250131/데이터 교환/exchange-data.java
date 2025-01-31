public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int a =5, b=6,c=7,temp2=0,temp=0;
        temp=b;
        b=a;
        temp2=c;
        c=temp;
        a=temp2;
        System.out.print(a+"\n"+b+"\n"+c);
    }
}