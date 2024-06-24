package practicesession;

public class move0toend {
	
	public static void movezerotoend(int arr[]) {
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				
				index=i;
				break;
			}
			
		}
		for(int i=index+1;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
				index++;
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,0,34,0,56,0,43};
		movezerotoend(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
