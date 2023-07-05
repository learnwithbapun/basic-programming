package pattern1;

import java.util.Scanner;

/*

Print N stars


******

*/

public class Assignment1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for (int i = 1; i <= N; i++) {

			System.out.print("*");
		}
	}
}