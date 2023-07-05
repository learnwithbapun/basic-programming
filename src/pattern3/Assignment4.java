package pattern3;

import java.util.Scanner;

/*
 * 
 * 4. Skip Even Numbers Half Pyramid
 * 
 * 7
1
1 
1 3
1 3 
1 3 5
1 3 5 
1 3 5 7



 Problem Description
Take an integer N as input, print the corresponding pattern for N.

For example if N = 5 then pattern will be like:

1
1_
1_3
1_3_
1_3_5
Note : Here '_' represents space for explanation purpose only. You have to print space in your code.


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

1
1 
Output 2:

 1
 1 
 1 3


Example Explanation
 Print the pattern as described.
 */

public class Assignment4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print(" ");
				} else {
					System.out.print(j);
				}

			}
			System.out.println();

		}

	}
}