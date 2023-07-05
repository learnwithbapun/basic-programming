package function1;

/*
 * Q2. Multiply the numbers

 * Problem Description

Given two numbers A & B. Return their product.


Problem Constraints

1 <= A <= 104

1 <= B <= 104



Input Format

First argument is an integer A.

Second argument is an integer B.



Output Format

Return an integer which is the product of A & B.



Example Input

Input 1:

A = 4, B = 3
Input 2:

A = 14, B = 34


Example Output

Output 1:

12
Output 2:

476


Example Explanation

Explanation 1:

4 * 3 = 12
Explanation 2:

14 * 34 = 476

 */
public class Assignment2 {

	public static int solve(int A, int B) {

		return A * B;

	}

	public static void main(String[] args) {
		System.out.println(solve(20, 12));
		
	}
}
