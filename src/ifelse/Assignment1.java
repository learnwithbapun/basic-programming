package ifelse;

import java.util.Scanner;

/*  
 * Q1. Which Month?
Problem Description

Write a program to input an integer(A) from user and print the Ath month of the year.

Months list: {January, February, March, April, May, June, July, August, September, October, November, December}



Problem Constraints

1 <= A <= 12



Input Format

One line containing an integer integer A.



Output Format

One line containing the Ath month of the year.



Example Input

Input 1:

1
Input 2:

6


Example Output

Output 1:

January
Output 1:

June


Example Explanation

Explanation 1:

Clearly, January is the 1st month.
Explanation 2:

Clearly, June is the 6th month.
 * 
 * */
public class Assignment1 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int month = scn.nextInt();

		if (month == 1) {
			System.out.println("January");
		} else if (month == 2) {
			System.out.println("February");
		} else if (month == 3) {
			System.out.println("March");
		} else if (month == 4) {
			System.out.println("April");
		} else if (month == 5) {
			System.out.println("May");
		} else if (month == 6) {
			System.out.println("June");
		} else if (month == 7) {
			System.out.println("July");
		} else if (month == 8) {
			System.out.println("August");
		} else if (month == 9) {
			System.out.println("September");
		} else if (month == 10) {
			System.out.println("October");
		} else if (month == 11) {
			System.out.println("November");
		} else if (month == 12) {
			System.out.println("December");
		}

	}
}
