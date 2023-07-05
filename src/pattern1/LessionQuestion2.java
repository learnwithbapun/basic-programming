package pattern1;

/*
 * 
 * GIVEN N,M print a rectangle of size N*M
 */
import java.util.Scanner;

public class LessionQuestion2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= m; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
