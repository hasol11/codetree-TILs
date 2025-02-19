import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //char arr1[]= new char[3];
        //int arr2[] = new int [3];
        int hos[]=new int [4];

        for(int i=0;i<3;i++){
            char a=sc.next().charAt(0);
            int b=sc.nextInt();
            if(a=='Y' && b>=37){
                hos[0]++;
            }else if(a=='N' && b>=37){
                hos[1]++;
            }else if(a=='Y' && b<37){
                hos[2]++;
            }else{
                hos[3]++;
            }
        }
        for(int i1=0;i1<hos.length;i1++){
            System.out.print(hos[i1]+" ");
        }

        if(hos[0]>=2){
            System.out.print("E");
        }
    }
}