package pattern1;

import java.util.Scanner;

/*
 * 12
12
*           *
*          *
*         *
*        *
*       *
*      *
*     *
*    *
*   *
*  *
* *
**

 */

public class LessonQuestion7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for (int i = 1; i <= N; i++) {
			System.out.print("*");
			for (int j = 1; j <= N-i ; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();

		}
	}
}
