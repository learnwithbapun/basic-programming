package pattern2;
/*
 * Q4. Full pyramid
 * 
 * 
 * 8
       * 
      * * 
     * * * 
    * * * * 
   * * * * * 
  * * * * * * 
 * * * * * * * 
* * * * * * * * 
 * 
 * Problem Description

Take an integer N, print the corresponding Full Pyramid pattern for N.

For example if N = 5 then pattern will be like:

    * 
   * * 
  * * * 
 * * * * 
* * * * * 
NOTE: There should be exactly one extra space after each * for each row.


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
Input 3:

 4


Example Output

Output 1:

  * 
 * * 
Output 2:

   * 
  * * 
 * * * 
Output 3:

    * 
   * * 
  * * * 
 * * * *   
 


Example Explanation

 Print the pattern as described.


 */
import java.util.Scanner;

public class Homework4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		for (int i = 1; i <= N; i++) {

			for (int j = 1; j <= N - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}
}
