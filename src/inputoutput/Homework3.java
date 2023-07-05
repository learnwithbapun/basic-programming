package inputoutput;

import java.util.Scanner;

/*
 * 
 * Q3. Add 10

Problem Description

You will be given an integer in the input. You need to add 10 to it and print the result to the output.

Input Format

One integer value in the input.

Output Format

Print a single integer the sum.

Problem Constraints

1 <= N <= 1000

Example Input

Input 1:-

3

Input 2:-

11

Example Output

Output 1:-

13

Output 2:-

21
 */
public class Homework3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = N + 10;
		System.out.println(result);
	}
}
