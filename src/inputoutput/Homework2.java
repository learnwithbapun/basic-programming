package inputoutput;

import java.util.Scanner;

/*
 * 
 * Q2. Average of five Numbers


Problem Description

Given 5 numbers A, B, C, D, E as input. Print the average of these 5 numbers (correct up to 2 decimal places).


Problem Constraints

1 <= A, B, C, D, E <= 104


Input Format

There are five lines in the input.
Each line has an integer.


Output Format

Print the average of the input numbers (correct up to 2 decimal places).


Example Input

Input:-
22
51
2
7
73


Example Output

Output:-
31.00


 */
public class Homework2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float n1, n2, n3, n4, n5;
		System.out.println("Enter all the numbers ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		n5 = sc.nextInt();
		float ans = (n1 + n2 + n3 + n4 + n5) / 5;
		System.out.printf("%.2f", ans);
	}
}
