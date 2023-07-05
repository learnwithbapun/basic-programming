package pattern2;

import java.util.Scanner;

//Given N print the following pattern

/*
 * 
 * 
 * 
*
*1
*1*
*1*2
*1*2*
*1*2*3
*1*2*3*
*1*2*3*4
*1*2*3*4*
*1*2*3*4*5
*1*2*3*4*5*
*
 */

public class LessonQuestion2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		for (int row = 1; row <= N; row++) {
			int k = 1;
			for (int col = 1; col <= row; col++) {
				if (col % 2 == 0) {
					System.out.print(k);
					k++;
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
