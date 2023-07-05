package pattern1;

import java.util.Scanner;

/*
Q4. Skip Even Numbers Half Pyramid


9
1
1 
1 3
1 3 
1 3 5
1 3 5 
1 3 5 7
1 3 5 7 9 

*/

public class Assignment4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {

				if (j % 2 == 0) {
					System.out.print(" ");

				} else {
					System.out.print(j);
				}

			}
			System.out.println();
		}

	}
}