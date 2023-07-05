package whileloop2;

import java.util.Scanner;

/*
 * Q5. Print in Range


Problem Description
Given two numbers A & B, print all the numbers from A to B in a single line.

Note : Try to solve this question using a while loop for learning purposes.


Problem Constraints
0 <= A <= 500
0 <= B <= 500


Input Format
First line denotes the value of A
Second line denotes the value of B


Output Format
Print the number from A to B


Example Input
5
9


Example Output
5 6 7 8 9


Example Explanation
A = 5
B = 9

Numbers from 5 to 9 are : 5 6 7 8 9


 */
public class Assignment5 {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	int A = scanner.nextInt();
	int B = scanner.nextInt();
	
	while(A <= B) {
		System.out.print(A+" ");
		A++;
	}
	
	}
}
