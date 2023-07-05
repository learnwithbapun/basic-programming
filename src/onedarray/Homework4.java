package onedarray;

import java.util.Scanner;

/*
 * 
 * Q4. Difference of even and odd


Problem Description:

Write a program to find the difference between the sum of all even elements and the sum of all odd elements from the given list.

Input Format:

A list containing integers.
Output Format:

The difference of the even and odd elements sum in integer format.
Sample Input:

1
56 63 87 24 32 13 15 19 44 52
Sample Output:

11
Sample explanation:

The sum of even elements is: 56 + 24 + 32 + 44 + 52 = 208. 
The sum of odd elements is: 63 + 87 + 13 + 15 + 19 = 197. 
Difference between even elements and odd elements sum is 208 - 197 = 11.
 */
public class Homework4 {

	public static int even_odd(int[] ls) {
		// Write your code here
		int evenSum = 0;
		int oddSum = 0;

		for (int i = 0; i < ls.length; i++) {
			if (ls[i] % 2 == 0) {
				evenSum = evenSum + ls[i];
			} else {
				oddSum = oddSum + ls[i];
			}

		}

		return Math.abs(evenSum - oddSum);

	}

	public static void main(String[] args) {
		even_odd(null);
	}
}
