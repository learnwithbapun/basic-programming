package whileloop;

import java.util.Scanner;

/*
 * 
 * Q4. Even Game

Problem Description

Write a program to print all even numbers from 1 to N where you have to take N as input from user.

[Note : Use while-loop OR for-loop, according to session flow.]



Problem Constraints

1 <= N <= 1000000



Input Format

A single line representing N




Output Format

All even numbers from 1 to N separated by spaces.



Example Input

Input 1:

5
Input 2:

10


Example Output

Output 1:

2 4 
Output 2:

2 4 6 8 10

 */
public class Assignment4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i = 2;
		while (i <= n) {
			System.out.print(i + " ");
			i += 2;
		}
	}
}
