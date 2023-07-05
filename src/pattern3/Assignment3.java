package pattern3;

import java.util.Scanner;

/*
 * 
 * Numeric Stair Pattern


 Problem Description

Take an integer N as input, print the corresponding pattern for N.

For example if N = 4 then pattern will be like:

8
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6 7 8


Problem Constraints

1 <= N <= 100



Input Format

First and only line of input contains a single integer N.



Output Format

Output the pattern corresponding to the given N.

NOTE: There should be no extra spaces after last integer and before first integer in any row and all integers in any row in the pattern are space separated.



Example Input

Input 1:

 2
Input 2:

 3


Example Output

Output 1:

1
1 2
Output 2:

1
1 2
1 2 3


Example Explanation

 Print the pattern as described.


 */

public class Assignment3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		for (int i = 1; i <= N; i++) {

			for (int j = 1; j <= i; j++) {
				if (j == i) {
					System.out.print(j);
				} else {
					System.out.print(j + " ");
				}

			}
			System.out.println();
		}

	}
}