import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] arr = new int [10];

	        for(int i=0;i<10;i++){
	            int n =sc.nextInt();
	            arr[i]=n;
	        }

	        for(int j=0;j<arr.length;j++){
	            if(arr[j]%3==0){
	                System.out.print(arr[j-1]);
                    break;
	            }
	        }
	    }
	}