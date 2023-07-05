package function1;

public class Assignment4 {
	/*
	 * 
	 * Q4. Division of Integers


Problem Description

Given two integers A and B, where A is divisible by B.

Print the value of quotient, when A is divided by B.


Problem Constraints

-109 <= A, B <= 109



Input Format

First argument is a single integer A.

Second argument is a single integer B.



Output Format

Print a single integer in a single line.



Example Input

Input 1:

 A = 8
 B = 2 
Input 2:

 A = -9
 B = 3 


Example Output

Output 1:

 4 
Output 2:

 -3 


Example Explanation

Explanation 1:

 Quotient of (8 / 2) = 4 
Explanation 2:

 Quotient of (-9 / 3) = -3 
	 */
	
	public static int divide(final int A, final int B) {
		return A/B;
    }
	public static void main(String[] args) {
System.out.println(divide(12, 3));
	}
}
