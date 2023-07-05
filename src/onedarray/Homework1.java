package onedarray;

import java.util.Scanner;

/*
 * 
 * Q1.. Q1. Negative Integers



Problem Description

Write a program to print all negative numbers from input array A of size N. Take integer N and N elements of the array as input from user.


Problem Constraints

1 <= N <= 1000

-1000 <= A <= 1000


Input Format

A single line representing N followed by N integers of the array A



Output Format

A single line containing elements from the input array which are negative in the same order.


Example Input

Input 1:

5 1 -5 2 -8 -4
Input 2:

4 -1 0 -8 -1

Example Output

Output 1:

-5 -8 -4
Output 2:

-1 -8 -1
Example explanation:

Output 1:

all the negative elements of [5 1 -5 2 -8 -4] are [-5 -8 -4]



Output 2:

all the negative elements of [4 -1 0 -8 -1] are [-1 -8 -1]
 */
public class Homework1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}