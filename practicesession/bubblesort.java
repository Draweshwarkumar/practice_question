package practicesession;
import java.util.Scanner;
public class bubblesort {
	
	public static int [] input() {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] =  new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		return arr;
		
		
	}
	
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
//	public static int [] bubblesort(int arr[]) {
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=0;j<arr.length;j++) {
//				if(arr[j]>arr[j+1]) {
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
//			}
//		}
//		return arr;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=input();
		print(arr);
//		bubblesort(arr);
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
	}

}
