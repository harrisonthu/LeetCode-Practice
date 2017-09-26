
public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		
		
		int[][] mygrid = new int[4][4];
		
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print(mygrid[i][j]);
			}
			System.out.println();
		}
		
		for(int row=0; row<4; row++){
			for(int col= row; col >=0 ;col--){
				mygrid[row][col] = 1;
			}
		}
		
		System.out.println("Another one");
		
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print(mygrid[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		int left = -1;
		int right = 1;
		
	}

}
