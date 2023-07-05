package pattern3;

import java.util.Scanner;

/*
 * Q2. Leading spaces pyramid
 * 
 * 8
8
-------*
------**
-----***
----****
---*****
--******
-*******
********


Problem Description
Take an integer N as input, print the corresponding pattern for N.

For example if N = 5 then pattern will be like:

____*
___**
__***
_****
*****
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

 *
**
Output 2:

  *
 **
***


Example Explanation
 Print the pattern as described.




 */
public class Homework2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		for (int row = 1; row <= N; row++) {

			for (int col = 1; col <= N - row; col++) {
				System.out.print("-");
			}

			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
