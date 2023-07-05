package whileloop2;

import java.util.Scanner;

/*
 * 
 * Q1. Print perfect squares

Problem Description

Given a number A. Print all perfect squares less than or equal to A.
Notes - Perfect squares are integers whose square root is an integer.


Problem Constraints

1 <= A <= 104



Input Format

A single line consisting of a integer A.



Output Format

Print perfect squares less than or equal to A in a single line in a space-separated manner.



Example Input

Input 1:

20
Input 2:

100


Example Output

Output 1:

1 4 9 16
Output 2:

1 4 9 16 25 36 49 64 81 100
 */
public class Assignment1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		int perfectSq = 1;
		int i = 1;

		while ((perfectSq = i * i) <= N) {

			System.out.print(perfectSq + " ");
			i++;
		}
	}
}
