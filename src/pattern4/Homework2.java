package pattern4;

import java.util.Scanner;

/*
 * 
 * . Hollow Inverted Half Pyramid
 * 
 * 8
********
*     *
*    *
*   *
*  *
* *
**
*




Problem Description

Given an integer N as input, print the corresponding Hollow Inverted Half Pyramid pattern for N.

For example if N = 6 then pattern will be like:

******
*   *
*  *
* *
**
*


Problem Constraints

1 <= N <= 100



Input Format

First and only line of input contains a single integer N.



Output Format

Output the Hollow Inverted Half Pyramid pattern corresponding to the given N.



Example Input

Input 1:

 2
Input 2:

 3
Input 3:

 4


Example Output

Output 1:

 **
 *
Output 2:

 ***
 **
 *
Output 3:

 ****
 * *
 **
 *


Example Explanation

 Print the pattern as described.
 */
public class Homework2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for (int i = 1; i <= N; i++) {

			System.out.print("*");

			for (int j = 1; j <= N - i - 1; j++) {
				if (i == 1) {
					System.out.print("*");
					continue;
				}
				System.out.print(" ");
			}
			if (i != N) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}