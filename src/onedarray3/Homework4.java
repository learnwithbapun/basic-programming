package onedarray3;

import java.util.Scanner;

/*
 * 
Q3. Right Shift an Array


Problem Description

Write a program that reads an integer array A from input and modifies the array by shifting each element to the right by one position and by shifting the last element to the first position. Return the modified array.

Problem Constraints

1 <= N <= 105 1 <= A[i] <= 109
Input Format

The first line of the input is the size of the array N. The second line of the input is N integers of the array separated by space.
Output Format

Print a single line that is the elements of the modified array separated by space.
Example Input

5
1 2 3 4 5
Example Output

5 1 2 3 4
 */
public class Homework4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		int arr2[] = new int[n];

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {

			arr[i] = scanner.nextInt();
		}
		arr2[0] = arr[n - 1];
		for (int i = 0; i < n - 1; i++) {

			arr2[i + 1] = arr[i];

		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr2[i] + " ");
		}

	}
}