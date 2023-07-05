package onedarray;

import java.util.Scanner;

/*
 * 
 * Q1. Q3. Sum the Array


Problem Description
Write a program to print sum of elements of the input array A of size N.


Problem Constraints
1 <= N <= 1000

1 <= A <= 1000



Input Format
A list of length N



Output Format
A single integer containing sum of elements from the input array.



Example Input
Input 1:

5 1 2 3 4 5
Input 2:

4 10 50 40 80


Example Output
Output 1:

15
Output 2:

180
*/

public class Assignment3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int arr[] = new int[N];
		int sum = 0;

		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		}

		for (int i = 0; i < N; i++) {
			sum += arr[i];

		}
		System.out.println(sum);

	}
}