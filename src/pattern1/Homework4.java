package pattern1;

import java.util.Scanner;

/*
 
 Leading spaces inverted pyramid


7
*******
 ******
  *****
   ****
    ***
     **
      *

  */

public class Homework4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= N - i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}