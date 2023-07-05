package twodarray;

public class Solution {
	public static int[][] solve(int[][] A) {

		int N = A.length;
		int M = A[0].length;

		int transpose[][] = new int[M][N];


		for (int i = 0; i < N; i++) {
  
			for (int j = 0; j < M; j++) {
				transpose[j][i] = A[i][j];
			}
		}
		return transpose;
	}

	public static void main(String[] args) {

		int arr[][] = new int[2][3];
		int n = 1;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {

				arr[i][j] = n;
				n++;

			}
		}
int arr2[][]= solve(arr);
System.out.println(arr2);

	}
}
