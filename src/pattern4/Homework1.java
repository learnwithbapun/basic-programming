package pattern4;

import java.util.Scanner;

/*
 * 
 * . Photo Frame Pattern


Problem Description
Take an integer N as input, print the corresponding pattern for N.

For example if N = 5 then pattern will be like:

*****
*   *
*   *
*   *
*****
Note : Except for the first line and the last line, every line will have N-2 spaces between the two stars.


Problem Constraints
3 <= N <= 100


Input Format
First and only line of input contains a single integer N.



Output Format
Output the pattern corresponding to the given N.



Example Input
Input 1:

 3
Input 2:

 4


Example Output
Output 1:

***
* *
***
Output 2:

 
****
*  *
*  *
****


Example Explanation
 Print the pattern as described.
 */
public class Homework1 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int N = scanner.nextInt();

	for (int i = 1; i <= N; i++) {

		System.out.print("*");
		for (int j = 1; j <= N - 2; j++) {
			if (i == 1 || i == N) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}
		System.out.println("*");

	}

}
}
