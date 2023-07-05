package pattern4;

import java.util.Scanner;

public class Assignment1 {
	
	/*
	 * 
	 * . Two Line Star Pattern

Problem Description
Take an integer N as input, print the corresponding pattern for N.

For example if N = 5 then pattern will be like:

*   *
*   *
*   *
*   *
*   *
Note : Here there are N-2 blank spaces between the stars in each line. You have to print space in your code.



Problem Constraints
1 <= N <= 100



Input Format
First and only line of input contains a single integer N.



Output Format
Output the pattern corresponding to the given N.



Example Input
Input 1:

 2
Input 2:

 3


Example Output
Output 1:

**
**
Output 2:

 
 * *
 * *
 * *


Example Explanation
 Print the pattern as described.


	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.print("*");
			for (int j = 1; j <= N - 2; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
	}
}
		
