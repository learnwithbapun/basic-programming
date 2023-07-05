package twodarray;

import java.util.Scanner;
/*
 * 
 * Q4. Wave Print (Row Wise)


Problem Description
You are given an integer matrix mat and you have to print the elements of the matrix in wave form (row wise)

See example for clarifications regarding wave print.


Problem Constraints
1 <= N <= 103

0 <= Mat[i][j] <= 109



Input Format
First line is an integer N

Next N lines contain N space separated integers representing the matrix Mat



Output Format
A single line containing N*N integers of matrix Mat in wave form (row wise)



Example Input
Input 1:

[[4, 1, 2],
 [7, 4, 4], 
 [3, 7, 4]]
Input 2:

[[1, 2],
 [3, 4]]


Example Output
Output 1:

4 1 2 4 4 7 3 7 4
Output 2:

1 2 4 3


Example Explanation
For Input 1:
We will first iterate the 1st row from left to right and print the elements, 
then we will iterate the 2nd row from right to left and print the elements,
then we will iterate the 3rd row from left to right and print the elements.
This looks like a wave.
For Input 2:
We will first iterate the 1st row from left to right and print the elements, 
then we will iterate the 2nd row from right to left and print the elements.
This looks like a wave.
 */
public class Assignment4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = N;

		int mat[][] = new int[N][M];
		for (int i = 0; i < N; i++) {

			for (int j = 0; j < M; j++) {

				mat[i][j] = scanner.nextInt();

			}
		}

		for (int i = 0; i < N; i++) {
			if (i % 2 == 0) {

				for (int j = 0; j < M; j++) {
					System.out.print(mat[i][j] + " ");
				}
			} else {
				for (int j = M - 1; j >= 0; j--) {
					System.out.print(mat[i][j] + " ");
				}
			}
		}

	}
}



