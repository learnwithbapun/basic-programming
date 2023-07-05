package inputoutput;

import java.util.Scanner;

/*
 * 
 * Q7. Total Bills Value
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Your friend Rahul plans to visit exotic countries all around the world. Sadly, Rahul's math skills aren't good. He's pretty worried about being scammed by currency exchanges during his trip - and he wants you to make a currency calculator for him. Here are his specifications for the app:

Given the value of a single bill and the amount of bills you received, print the total value of the bills.

Input Format

The first line of the input is an integer N denoting the value of a single bill.

The second line of the input is an integer M denoting the number of bills.

Output Format

Print in a single line denoting the total value of bills.

Problem Constraints

1 <= N <= 100

1 <= M <= 100

Example Input

Input:-

12

10

Example Output

Output:-

120

Note: The problem constraints mean that when we test your code, the test cases used in the backend can have input values only within those constraints. You need not implement them in your code. You need to make sure your code will work for all such input values!



 */
public class Homework7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int result = N * M;
		System.out.println(result);

	}
}
