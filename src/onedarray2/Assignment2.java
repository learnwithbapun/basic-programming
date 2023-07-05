package onedarray2;

import java.util.Scanner;

/*
 * 
 * Q1.Frequency of X in Array

Problem Description
Given an integer array A. Find and return the frequency of number B in array A.


Problem Constraints
1 <= |A| <= 105
1 <= A[i] <= 109
1 <= B <= 109


Input Format
The first argument is an integer array A.
The second argument is an integer B.


Output Format
Return the frequency of B in the array A.


Example Input
Input:-
A = [1, 1, 2, 4, 2]
B = 2


Example Output
Output:-
2


Example Explanation
Explanation:-
There are two occurences of 2 in array A
 */
public class Assignment2 {
	public static int solve(int[] A, int B) {
		int count = 0;

		for (int i = 0; i < A.length; i++) {

			if (A[i] == B) {
				count++;
			}

		}
		return count;
	}

	public static void main(String[] args) {

	}
}