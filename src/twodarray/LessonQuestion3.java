package twodarray;

import java.util.Scanner;

//Take INPUT a 2D Matrix and print WAVE  print col by col
public class LessonQuestion3 {
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

		for (int j = 0; j < M; j++) {

			if (j % 2 == 0) {
				for (int i = 0; i < N; i++) {

					System.out.print(mat[i][j] + " ");
				}
			} else {
				for (int i = N - 1; i >= 0; i--) {
					System.out.print(mat[i][j] + " ");
				}
			}
			System.out.println();
		}

	}
}
