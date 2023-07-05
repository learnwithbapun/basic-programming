package onedarray3;

import java.util.Scanner;

/*
 * 
Q3. Inverse of the Array

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
public class Homework3 {

	public int[] solve(int[] A) {

		int arr[] = new int[A.length];
		// arr[0] = A[A.length-1];
		for (int i = 0; i < A.length; i++) {
			arr[A[i]] = i;

		}

		return arr;
	}

	public static void main(String[] args) {

	}

}