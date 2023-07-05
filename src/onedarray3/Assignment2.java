	package onedarray3;
/*
 * 
 * Q2. Unique Element

Problem Description
Given an Array of integers A, every element in it is repeated twice except one, find that unique element.


Problem Constraints
1<= Length of array A <= 103
0<= Ai <=1000


Input Format
First argument A is the given array.


Output Format
Return an Integer X, such that X occurs once in the A.


Example Input
Input 1:

A = [1, 4, 3, 5, 2, 3, 5, 1, 4]
Input 2:

A = [9, 10, 7, 10, 9, 1, 5, 1, 5]


Example Output
Output 1:

2
Output 2:

7


Example Explanation
In Example 1:
All the elements except for 2 occurs twice in the array. Hence 2 is the unique element.

 */
public class Assignment2 {
	
	public static int solve(int[] A) {

		for (int i = 0; i < A.length; i++) {

			int element = A[i];
			int count = 0;
			for (int j = 0; j < A.length; j++) {
				if (element == A[j]) {
					count++;

				}

			}

			if (count == 1) {
				return A[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,9,9};
			System.out.println(solve(arr));

		}

}
