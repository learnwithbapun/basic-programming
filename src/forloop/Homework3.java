package forloop;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int orgNum = N;
		int sum = 0;
		int modDiv = 0;
		int modQueue = 0;
		for (int i = 1; i <= N; i++) {
			int j = i;
			sum =0;
			while (j > 0) {
				modDiv = j % 10;
				modQueue = modDiv * modDiv * modDiv;
				sum = sum + modQueue;
				j = j / 10;

			}

			if (i == sum) {
				System.out.println(i);
			}

		}

	}
}
