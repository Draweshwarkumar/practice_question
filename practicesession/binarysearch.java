package practicesession;

public class binarysearch {
	
	public static int  binarysearch(int arr[],int n) {
		int start =0;
		int end=arr.length-1;
		while (start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==n) {
				return mid;
			}
			else if(n>arr[mid]) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		return-1;
		
	}
	
	public static void main (String[]args) {
		int arr[]= {23,34,45,67,78,89};
		int n=78;
		System.out.print(binarysearch(arr,n));
		
	}

}
