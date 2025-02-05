import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int cnt =0;

        for(int i=a;i<=b;i++){
            if(cal1(i)){                
                cnt++;
            }
        }
        System.out.print(cnt);
    }

    public static boolean cal1(int i){
        return i%3==0||cal2(i);
    } 

    public static boolean cal2(int i){
        //몫이 0보다 작으면 더 이상 나눌 수 없는 거인데..
        //int result=0;
        int rest=0; 
        boolean value=false;
        int result=i;

        while(result!=0){
            result=i/10;
            rest=i%10;
            if(rest==3||rest==6||rest==9){
                value=true;
                break;
            }
            i=i/10;
            //예를 들어 254이면 25가 몫 4가 나머지 나머지를 비교하고 몫이 0이면 break;
        }
        return value;
    }
}