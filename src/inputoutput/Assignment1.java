package inputoutput;

import java.util.Scanner;

/*Q1. A says Hi to B

Problem Description

Given two names A and B as input. Print "A says Hi to B". where A and B are the names in input.


Problem Constraints

1 <= len(A), len(B) <= 15
Characters in A and B are in lowercase English Alphabets.


Input Format

There are two input lines
The first line has a string A.
The second line has a string B.


Output Format

Print in a single line A says Hi to B.


Example Input

Input:-
Ram
Shyam


Example Output

Output:-
Ram says Hi to Shyam*/

public class Assignment1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String n1 = sc.next();
		String n2 = sc.next();
		System.out.println(n1 + " says Hi to " + n2);
	}

}
