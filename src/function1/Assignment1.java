package function1;

/*
 * Q1. Add the numbers

Problem Description
Given two numbers A & B. Return their sum.


Problem Constraints
1 <= A <= 107

1 <= B <= 107



Input Format
First argument is an integer A.

Second argument is an integer B.



Output Format
Return an integer which is the sum of A & B.



Example Input
Input 1:

A = 4, B = 3
Input 2:

A = 14, B = 34


Example Output
Output 1:

7
Output 2:

48


Example Explanation
Explanation 1:

4 + 3 = 7
Explanation 2:

14 + 34 = 48

 */
public class Assignment1 {

	public static int solve(int A, int B) {
		return A + B;
	}

	public static void main(String[] args) {

		int sum = solve(15, 23);
		System.out.println(sum);
	}
}
