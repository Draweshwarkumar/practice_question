package practicesession;
import java.util.Scanner;
public class largestcolumnsum {
	
	public static void input(int arr[][]) {
		Scanner s= new Scanner(System.in);
		int rows=arr.length;
		int colms= arr[0].length;
//		int arr[][]= new int[rows][colms]
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<colms;j++) {
				arr[i][j] = s.nextInt();
			}
		}
	}
	
	public static int [][] print (int arr[][]) {
		int rows=arr.length;
		int colms=arr[0].length;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<colms;j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		return arr;
	}
	
	public static int largestcolumnsum(int arr[][]) {
		int max=Integer.MIN_VALUE;
		
		int rows=arr.length;
		int colms=arr[0].length;
		for(int j=0;j<colms;j++) {
			int sum=0;
			for(int i=0;i<rows;i++) {
				sum=sum+arr[i][j];
			}
			if(sum > max) {
				max=sum;
			}
			
		}
		return max;
		
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int colms = sc.nextInt();
		int arr[][]= new int[rows][colms];
		input(arr);
		print(arr);
		System.out.println("The largestcolumnsum is "+largestcolumnsum(arr));
	}

}
