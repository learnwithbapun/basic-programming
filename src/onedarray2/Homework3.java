package onedarray2;

public class Homework3 {
	/*
	3. Consecutive Duplicate




Problem Description:

Write a function to check if the input list has consecutive duplicate elements or not.
Return True if there are consecutive duplicate elements in the list else return False.

Here by consecutive duplicates, we mean duplicates that are present at consecutive indices in the array

Input Format:

An integer array A as the function argument.
Output Format:

Return True or False
Sample Input:

1
4
1 2 3 3
Sample Output:

True
Sample Explanation:

As there are 3 3 in the list i.e. at indices 2 and 3, there True is returned.


	 */

	public static boolean solve(int arr[]) {
	    // Complete the function here

	    for(int i =0; i <= arr.length-2;i++){

	        if(arr[i+1] == arr[i]){
	            return true;
	        }
	    }
	    return false;
	}

	public static void main(String[] args) {

	}

}
