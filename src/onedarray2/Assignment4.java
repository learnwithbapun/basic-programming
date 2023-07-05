package onedarray2;

import java.util.Scanner;

/*
 * 
 * First and Last Index


Problem Description
Given a sorted integer array A, and an integer B. Find the first and last index of B in A.
It is guaranteed that B exists in A. Return an array C of size 2, where C[0] is the first index of B in A and C[1] is the last index of B in A.

Note - Indexing of A starts from 0. If the element only exists once, the values of both elements in the C list should be the same.

Problem Constraints
1 <= |A| <= 105
-109 <= A[i] <= 109
-109 <= B <= 109


Input Format
The first argument is an array A.
The second argument is an integer B.


Output Format
An integer array C of size 2.


Example Input
Input 1:
A = [-2, -2, 4, 4, 8, 9]
B = 4
Input 2:
A = [1, 9, 9, 9, 10, 21]
B = 9


Example Output
Output 1:
C =  [2, 3]
Output 2:
C = [1, 3]


Example Explanation
Explanation 1:
A[2] and A[3] are equal to 4.
Explanation 2:
A[1], A[2] and A[3] are equal to 9.
 */
public class Assignment4 {
	
	public static int[] solve(int[] A, int B) {

		int arr[] = new int[2];
		int j = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == B) {

				arr[j] = i;
				++j;
				break;
			}
		}

		for (int i = A.length - 1; i >= 0; i--) {
			if (A[i] == B) {

				arr[j] = i;

				break;
			}
		}

		return arr;
	}

	public static void main(String[] args) {

	}
}