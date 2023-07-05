package pattern1;

import java.util.Scanner;

/*
 * 12
***********
**********
*********
********
*******
******
*****
****
***
**
*
 */

public class LessonQuestion4 {
	/*
	 * Reverse Staire case
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N-i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
