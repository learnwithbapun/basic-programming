package pattern1;

import java.util.Scanner;

/*
 
 GIVEN  N IN INPUT AND PRINT THE FOLLOWING PATTERN
 
 *7
*******
******
*****
****
***
**
*

  */


public class Homework2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		for (int row = 1; row <= N; row++) {
			for (int col = 1; col <= N + 1 - row; col++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}
}
