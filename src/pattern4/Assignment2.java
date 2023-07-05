package pattern4;

import java.util.Scanner;

public class Assignment2 {
	
	/*
	 * 
	 * . Hollow inverted pyramid pattern
	 * 
	 * 8
*              *
**            **
***          ***
****        ****
*****      *****
******    ******
*******  *******
****************


Problem Description
Take an integer N as input, print the corresponding pattern for N.

For example if N = 5 then pattern will be like:

*________* // 8 spaces

**______** // 6 spaces

***____*** // 4 spaces

****__**** // 2 spaces

********** // 0 spaces

NOTE: Here '_' is used to represent spaces. You have to print spaces in your code.


Problem Constraints
2 <= N <= 100



Input Format
First and only line of input contains a single integer N.



Output Format
Output the Full Pyramid pattern corresponding to the given N.



Example Input
Input 1:

 2
Input 2:

 3


Example Output
Output 1:

*__* // 2 spaces

**** // 0 spaces
Output 2:

*____* // 4 spaces

**__** // 2 spaces

****** // 0 spaces

NOTE: Here '_' is used to represent spaces. You have to print spaces in your code.




Example Explanation
 Print the pattern as described.


	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			for (int j = 1; j <=  2*(N - i); j++) {
				System.out.print(" ");
			}
			for (int m = 1; m <= i; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
