package ifelse3;

import java.util.Scanner;

/*
 * Q2. Leap Year III


Problem Description
Given an integer A representing an year, Return 1 if it is a leap year else return 0.

A year is leap year if the following conditions are satisfied:

Year is multiple of 400.
Else the year is multiple of 4 and not multiple of 100.


Problem Constraints
1 <= A <= 109



Input Format
First and only argument is an integer A



Output Format
Return 1 if it is a leap year else return 0



Example Input
Input 1

 A = 2020
Input 2:

 A = 1999


Example Output
Output 1

 1
Output 2:

 0


Example Explanation
Explanation 1

 2020 is a leap year as it is a multiple of 4 and not a multiple of 100.
Explanation 2:

 1999 is not a leap year.
 */
public class Homework2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// year to be checked
		int year = scanner.nextInt();
		if ((year % 400 == 0) || (	(year % 4 == 0) && (year % 100 != 0))) {

			// Both conditions true- Print leap year
			System.out.println(1);
		}

		else {
			// Any condition fails- Print Non-leap year
			System.out.println(0);
		}
	}
}