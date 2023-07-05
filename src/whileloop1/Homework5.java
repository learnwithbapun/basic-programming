package whileloop1;

import java.util.Scanner;

/*
 * Multiples of 4

Problem Description
Given an integer input N, print all multiples of 4 less than or equal to N.


Problem Constraints
1 <= N <= 10000


Input Format
Single line containing an integer N.


Output Format
Space separated integers representing multiples of 4 less than or equal to N.


Example Input
22


Example Output
4 8 12 16 20


Example Explanation
1 * 4 = 4
2 * 4 = 8
3 * 4 = 12
4 * 4 = 16
5 * 4 = 20

All are multiples of 4 less than 22
 */
public class Homework5 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int i = 4;

		while (i <= N) {
			System.out.print(i + " ");
			i += 4;

		}

		// SOLUTION PROVIDED
		int n = scanner.nextInt();
		int i1 = 1;
		while (i1 <= n) {
			if (i1 % 4 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
	}

//SOLUTION PROVIDED

}
