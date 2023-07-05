package pattern1;

import java.util.Scanner;

/*
 * Q1. Numeric Stair Pattern

6
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6



 */
public class Homework1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		for (int i = 1; i <= N; i++) {

			for (int j = 1; j <= i; j++) {
				if (j != i) {
					System.out.print(j + " ");
				} else {
					System.out.print(j);
				}

			}
			System.out.println();
		}

	}
}
