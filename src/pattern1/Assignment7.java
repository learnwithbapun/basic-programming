package pattern1;

import java.util.Scanner;

/*

Inverted Numeric Pyramid


8
1 2 3 4 5 6 7 8
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1


*/

public class Assignment7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		for (int i = N; N != 0; N--) {

			for (int j = 1; j <= N; j++) {

				if (j == N) {
					System.out.print(j);
				} else {
					System.out.print(j + " ");
				}

			}
			System.out.println();
		}

	}
}