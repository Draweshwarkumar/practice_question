package practicesession;

public class waveprint {
	
	public static void waveprint(int input[][]) {
		int rows=input.length;
		int colms= input[0].length;
		
		for(int j=0;j<colms;j++) {
			if(j%2==0) {
				for(int i=0;i<rows;i++) {
					System.out.print(input[i][j]+" ");
				}
			}
				else {
					for(int i=rows-1;i>=0;i--) {
						System.out.print(input[i][j]+" ");
					}
				}
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[][]= {{1,2,3,4,5},{6,7,8,9,3},{6,7,3,9,5}};
		waveprint(input);
	}

}
