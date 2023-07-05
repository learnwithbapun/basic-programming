package ifelse3;

import java.util.Scanner;

/*
 * Q3. Music Certification


Problem Description

A programmer for a music company is developing a program to determine the highest level of certification for an album.
The program needs to follow this table of thresholds for each certification level:
Minimum albums sold	Certification
500000	gold
1000000	platinum
10000000	diamond
Given the albums sold(N) as input, print the certification for the album.



Problem Constraints:

1 <= N <= 1000000000


Input Format

There is only 1 single line in the input, which is the integer denoting the no. of albums sold.


Output Format

Output the certification either diamond, platinum or gold.
If no certification, print None.


Example Input

Input 1:-
50
Input 2:-
500000


Example Output

Output 1:-
None
Output 2:-
gold
 */
public class Assignment3 {
	public static void main(String[] args) {

//		NOT OPTIMISE SOLUTION
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		if (N >= 500000 && N < 1000000) {
			System.out.println("gold");
		} else if (N >= 1000000 && N < 10000000) {
			System.out.println("platinum");
		} else if (N >= 10000000) {
			System.out.println("diamond");
		} else {
			System.out.println("None");
		}

		// NOT OPTIMISE SOLUTION

		// OPTIMISE SOLUTION
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		if (n >= 10000000) {
			System.out.println("diamond");
		} else if (n >= 1000000) {
			System.out.println("platinum");
		} else if (n >= 500000) {
			System.out.println("gold");
		} else {
			System.out.println("None");
		}
		// //OPTIMISE SOLUTION
	}
}
