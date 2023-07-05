package function1;

/*
 * 
 * Q3. Square of a number


Problem Description

Given a number A. Return square of the number.


Problem Constraints

1 <= A <= 104



Input Format

First argument is an integer A.



Output Format

Return an integer which is the square of A.



Example Input

Input 1:

A = 4
Input 2:

A = 14


Example Output

Output 1:

16
Output 2:

196


Example Explanation

Explanation 1:

square(4) = 16
Explanation 2:

square(14) = 196
 */
public class Assignment3 {
	public static int solve(int A) {
		return A * A * A;
	}

	public static void main(String[] args) {

		System.out.println(solve(9));
	}

}
