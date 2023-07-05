package whileloop2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		for (int i = 1; i <= N; i++) {
   			int count = 0;
   			int l = 1;
			for (int j = i; j > 0; j--) {
				
				int k = j;
				if (i % l == 0) {
					count++;
				}
				l++;

			}

			if (count == 2) {
				System.out.print(i);
			}

		}
	}

}
