package onedarray3;

import java.util.Scanner;

/*
 * 
Q2. Remove that

PProblem Description

Write a program to input N numbers array from user and an integer X and print the array by deleting element at specified position X.

Problem Constraints

1 <= N <= 100

1 <= A[i] <= 1000

1 <= X <= N

Input Format

First line is N which means number of elements.

Second line contains N space separated integers.

Third line is X position which has to be deleted.
Output Format

N-1 space separated integers of the input array after deleting the element at required position.
Example Input

5
2 3 1 4 2
3
Example Output

2 3 4 2
Example Explanation

Clearly after removing A[3] = 1, remaining array is 2 3 4 2.
 */
public class Homework2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int arr[] = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		}

		int X = scanner.nextInt();

		for (int i = 0; i < N; i++) {

			if (i == X - 1) {
				continue;
			}
			System.out.print(arr[i] + " ");
		}

	}
}