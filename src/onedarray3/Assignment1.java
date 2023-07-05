package onedarray3;

public class Assignment1 {
	
	/*
	 * 
	 * Q1. Frequency count

Problem Description
You are given an integer array A, you have to return an integer array of same size whose ith element is the frequency count of A[i] in array A .



Problem Constraints
1 <= len(A) <= 1000

1 <= A[i] <= 100



Input Format
First argument is an array of integers representing array A.



Output Format
You have to return an array of integers as per the question.



Example Input
Input 1:

A = [1, 2, 5, 1, 5, 1 ]


Example Output
Output 1:

[3, 1, 2, 3, 2, 3]


Example Explanation
Explanation 1:

Clearly, In the given array we have 1 three times, 2 one time and 5 two times.
	 */

	public static int[] solve(int[] A) {

		int arr[] = new int[A.length];

		for (int i = 0; i < A.length; i++) {
			int element = A[i];
			int count = 0;

			for (int j = 0; j < A.length; j++) {
				if (element == A[j]) {
					count++;
				}

			}
			arr[i] = count;
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,9,9};
		int b[]  = solve(arr);
		
		for(int i =0; i <=b.length-1;i++) {
			System.out.println(b[i]);

		}
		
	}

}
