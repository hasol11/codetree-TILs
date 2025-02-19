import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //count를 작성하고 값을 하나씩 뱉을 때 
        //2가 등장하면 ++ 진행 
        //count ==3이면 break
        Scanner sc = new Scanner(System.in);
        int count =0;
        int answer=0;

        int num=sc.nextInt();
        int arr[]=new int[num];

        for(int i=0;i<num;i++){
            int a= sc.nextInt();
            arr[i]=a;
        }
        for(int i=0;i<num;i++){
            if(arr[i]==2){
                count+=1;
            }
            if(count==3){
                answer=i+1;
                break;
            }
        }
        System.out.print(answer);
    }
}