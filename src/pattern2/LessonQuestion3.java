package pattern2;

import java.util.Scanner;

//Given N print the following pattern

/*
 * 
 * 
 * 
*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21 
22 23 24 25 26 27 28 
29 30 31 32 33 34 35 36 
*
 */

public class LessonQuestion3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int k = 1;
		for (int row = 1; row <= N; row++) {

			for (int col = 1; col <= row; col++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
}
