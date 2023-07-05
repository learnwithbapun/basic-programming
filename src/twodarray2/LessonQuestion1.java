package twodarray2;

/*
 * 
 * Given a mat in A write a function that returns
the transpose of a matrix
 */
public class LessonQuestion1 {
	static int[][] transpose(int arr[][]) {
		
		int n = arr.length;
		int m = arr[0].length;
		
		int trans[][] = new int[m][n];
		
		for(int i =0; i <n;i++) {
			for(int j=0;j < m;j++) {
				trans[m][n]=arr[n][m];
			}
		}
		
		return trans;

}
	public static void main(String[] args) {
		
	}
}
