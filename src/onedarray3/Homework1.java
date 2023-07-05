package onedarray3;

import java.util.Scanner;

/*
 * 
 * Insert that
Problem Description

Write a program to input N numbers array, a number X and a number Y from user and insert an element Y in it at specified position X. X is based on 1-based indexing.

Note: When an element is inserted at position X, all elements that were already present at position >= X, gets shifted to one position right, not replaced.

Problem Constraints

1 <= N <= 100

1 <= A[i] <= 1000

1 <= X <= N

1 <= Y <= 1000

Input Format

First line is N which represents number of elements.

Second line contains N space separated integers.

Third line is X position where Y has to be inserted.

Fourth line is Y which is the value to be inserted.

Output Format

N+1 space separated integers of the input array after inserting the element at required position.

Example Input

Input 1:

5

2 3 1 4 2

3

5

Example Output

Output 1:

2 3 5 1 4 2

Example Explanation

Explanation 1:

Clearly after inserting 5 at 3rd position, new array is 2 3 5 1 4 2.
 */
public class Homework1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int arr[] = new int[N];

		for (int i = 0; i < N; i++) {

			arr[i] = scanner.nextInt();
		}

		int X = scanner.nextInt();// POSITION 3
		int Y = scanner.nextInt();// ELEMENT

		X = X - 1; // 2
		int res[] = new int[N + 1];

		for (int i = 0; i < X; i++) {
			res[i] = arr[i];
		}
		res[X] = Y;

		for (int i = X + 1; i < N + 1; i++) {
			res[i] = arr[i - 1];
		}

		// for(int i =0; i < N+1;i++){
		// if(i < X){
		// res[i] = arr[i];
		// }
		// else if(i == X){
		// res[X] = Y;
		// }
		// else{
		// res[i] = arr[i-1];
		// }
		// }

		for (int i = 0; i < N + 1; i++) {
			System.out.print(res[i] + " ");
		}

	}
}
