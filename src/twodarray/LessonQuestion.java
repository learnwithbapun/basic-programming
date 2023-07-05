package twodarray;

import java.util.Scanner;

//Take N and M after that create N*M matrix and put the element int matrix of N*M And finally point the matrix
/*
 * 
 *
2
3
12
11
33
44
11
44
12 11 33 
44 11 44 
 */
public class LessonQuestion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();

		int[][] mat = new int[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {

				mat[i][j] = scanner.nextInt();
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {

				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

	}
}
