package twodarray;

/*
 * Q4. Largest in each Row of 2D Array

Problem Description
Given a 2D array A of N rows and M columns. Find value of largest element in each row.

Problem Constraints
1 <= N, M <= 1000
1 <= Ai <= 109


Input Format
There are 1 lines in the input
First 2 integers R, C are the number of rows and columns. Then R * C integers follow corresponding to the rowwise numbers in the 2D array


Output Format
Return an array of length N, in which every index i contains the maximun value of the ith row in the 2D matrix.


Example Input
Input 1:
2 2 1 2 1 3
Input 2:
1 3 1 2 3


Example Output
Output 1:
 [2, 3]
Output 2:
 [3]


Example Explanation
Explanation 1:
In the first row 2 is maximum value.
In the second row 3 is maximum value.
Explanation 2:
In the first and only row 3 is maximum value.
 
 
 */
public class Homework4 {
	public int[] solve(int[][] A) {

		int n = A.length;
		int m = A[0].length;

		int res[] = new int[n];

		for (int i = 0; i < n; i++) {
			int max = 0;
			for (int j = 0; j < m; j++) {

				if (A[i][j] > max) {
					max = A[i][j];
				}
			}
			res[i] = max;
		}

		return res;

	}

	public static void main(String[] args) {

	}
}
