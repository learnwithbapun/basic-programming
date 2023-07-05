package pattern1;

import java.util.Scanner;

/*

GIVEN N and M print an rectangle of size N*M.

**
**
**
**

*/

public class Assignment2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int M = scanner.nextInt();

		int N = scanner.nextInt();

		for (int row = 1; row <= M; row++) {
			for (int col = 1; col <= N; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
