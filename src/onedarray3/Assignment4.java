package onedarray3;
/*
 * 
 * Q4. Pair Count


Problem Description

You are given an integer array A and an integer B.

You are required to return the count of pairs having sum equal to B.

NOTE: pair (i,j) and (j,i) are same.



Problem Constraints

1 <= A.size() <= 10000

1 <= A[i] <= 10000

1 <= B <= 10000



Input Format

First argument is an integer array A.

Seond argument is an integer B.



Output Format

You have to return an integer representing count of required pairs.



Example Input

Input 1:

A = [1,2,3,2,1]
B = 5
Input 2:

A = [1,1,1]
B = 2


Example Output

Output 1:

2
Output 2:

3


Example Explanation

Explanation 1:

 A[1]+A[2] = A[2]+A[3] = 5
Explanation 2:

 A[0]+A[1] = A[0]+A[2] = A[1]+A[2] = 2
 */
public class Assignment4 {

	public static int solve(int[] A, int B) {

		int count = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {

				if (A[i] + A[j] == B) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8};
		System.out.println(solve(arr,8));
	}

}
