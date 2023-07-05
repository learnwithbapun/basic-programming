package pattern1;

import java.util.Scanner;

/*
 * 
 * Hollow pyramid pattern

8
****************
*******  *******
******    ******
*****      *****
****        ****
***          ***
**            **
*              *

 */

public class Homework5 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N - i + 1; j++) {
				System.out.print("*");
			}

			for (int j = 1; j <= 2 * (i - 1); j++) {
				System.out.print(" ");
			}
			for (int m = 1; m <= N - i + 1; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
