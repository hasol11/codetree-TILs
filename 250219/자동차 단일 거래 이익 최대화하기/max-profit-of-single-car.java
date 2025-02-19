import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int year=sc.nextInt();
        int arr []=new int[year];
        int max=0;

        for(int k=0;k<year;k++){
            arr[k]=sc.nextInt();
        }

        for(int i=0;i<year;i++){
            for(int j=i;j<year;j++){
                int cal=arr[j]-arr[i];
                    if(max<cal){
                        max=cal;
                    }
                }
            }
            System.out.print(max);
        }
        
    }
