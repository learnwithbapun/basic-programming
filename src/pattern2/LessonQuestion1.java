package pattern2;

import java.util.Scanner;

//Given N print the following pattern

/*
 * 
 * 
 * *
*2
*2*
*2*4
*2*4*
*2*4*6
*2*4*6*
*
 */

public class LessonQuestion1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		for (int row = 1; row <= N; row++) {
			for (int col = 1; col <= row; col++) {
				if (col % 2 == 0) {
					System.out.print(col);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
