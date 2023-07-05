package function1;

/*
 * Q1. Find The Floor
 * 
 * Problem Description

Given an integer A, find the floor value of real number A / 200.

Floor value of a real number X is the greatest integer less than or equal to X.


Problem Constraints

-108 <= A <= 108



Input Format

First and only argument is an integer A.



Output Format

Return an integer denoting the floor value of real number A / 200.



Example Input

Input 1:

 A = 2113 
Input 2:

 A = -2113 
Input 3:

 A = 7 
Input 4:

 A = -400 


Example Output

Output 1:

 10 
Output 2:

 -11 
Output 3:

 0 
Output 4:

 -2 


Example Explanation

Explanation 1:

 A / 200 = 2113 / 200 = 10.565
 Floor value of 10.565 is 10.
Explanation 2:

 A / 200 = -2113 / 200 = -10.565
 Floor value of -10.565 is -11.
Explanation 3:

 A / 200 = 7 / 200 = 0.035
 Floor value of 0.035 is 0.
Explanation 4:

 A / 200 = -400 / 200 = -2.00
 Floor value of -2.00 is -2



 */
public class Homework1 {

	public static int solve(int A) {

		float d =(float)A / 200;
		System.out.println(d);
		
		
		int number = (int) Math.floor(d);
		
		return number;
	}

	public static void main(String[] args) {
		System.out.println(solve(-771));
	}

}
