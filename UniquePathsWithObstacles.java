
public class UniquePathsWithObstacles {

	public static int[][] mygridfunction() {

		int[][] mygrid = new int[5][3];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(mygrid[i][j]);
			}
			System.out.println("");
		}
		
		
		return mygrid;
	}

	public static void main(String args[]) {
		
		System.out.println(mygridfunction());
	}

}
