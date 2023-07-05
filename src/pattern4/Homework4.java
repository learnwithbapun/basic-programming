package pattern4;

import java.util.Scanner;

/*
 * 
 * . Q4. Half Diamond


Take an integer N as input, print the corresponding Half Diamond pattern with 2*N - 1 rows.

For example if N = 5 then pattern will be like:

* 
**
***
****
*****
****
***
**
*
NOTE: There should be no spaces after any * .


Problem Constraints

2 <= N <= 100



Input Format

First and only line of input contains a single integer N.



Output Format

Output the Half Diamond pattern corresponding to the given N.



Example Input

Input 1:

 2
Input 2:

 3


Example Output

Output 1:

 * 
 **
 *
Output 2:

 *
 **
 ***
 **
 *


Example Explanation

 Print the pattern as described.
 */
public class Homework4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		for (int i = 1; i <= N; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= N - 1; i++) {
			for (int j = 1; j <= N - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}