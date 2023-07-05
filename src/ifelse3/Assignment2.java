package ifelse3;

import java.util.Scanner;
/*
 * Q2. Pac-man


Problem Description

In this exercise, you need to implement some rules from Pac-Man, the classic 1980s-era arcade-game.

You have to answer whether the Pac-Man loses or not.

Your are given the following boolean inputs (0 / 1) each in one line:

1. Does the Pac-Man have a power pellect active

2. Is the Pac-Man touching a ghost

The Pac-Man loses if it is touching a ghost and does not have a power pellet active.



Input Format

There are 2 lines in the input.
The first line indicates if the Pac-Man has a power pellet active (1 for yes, 0 for no)
The second line indicates if the Pac-Man is touching a ghost (1 for yes, 0 for no)


Output Format

Print 1 if the Pac-Man loses else 0.


Example Input

Input 1:-
0
1
Input 2:-
0
0


Example Output

Output 1:-
1
Output 2:-
0
 */
public class Assignment2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		if (n == 0) {
			if (m == 1) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		} else {
			System.out.println(0);
		}
	}

}
