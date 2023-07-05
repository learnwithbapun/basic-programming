package function1;

/*
 * 
 * Q5. Cube It!


Problem Description

You are given an integer A.

You have to find the value of cube of A i.e, A3.


Problem Constraints

1 <= A <= 1000



Input Format

First and only parameter is an integer A.



Output Format

Single line integer output.



Example Input

Input 1:

 A = 1 
Input 2:

 A = 2 


Example Output

Output 1:

 1 
Output 2:

 8 


Example Explanation

Explanation 1:

 Value of 13 = 1 
Explanation 2:

 Value of 23 = 2 * 2 * 2 = 8 
 */

public class Assignment5 {

	public static int cube(final int A) {
		return A * A * A;
	}

	public static void main(String[] args) {
System.out.println(cube(9));
	}
}
