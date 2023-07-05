package inputoutput;

import java.util.Scanner;

/*
 
 Q4. A Simple Calculator

 Problem Description
Given two numbers A and B. Print A+B, A*B, A-B, A/B in the same order.


Problem Constraints
1 <= A, B <= 104


Input Format
There are two input lines
The first line has a single integer A.
The second line has a single integer B.


Output Format
Print in a single line separated by space A+B, A*B, A-B, A/B in the same order.


Example Input
Input 1:-
4
5
Input 2:-
16
2

Example Output
Output 1:-
9 20 -1 0
Output 2:-
18 32 14 8


Example Explanation
Explanation 1:-
4 + 5 = 9, 4 * 5 = 20, 4 - 5 = -1, 4 / 5 = 0
Explanation 2:-
16 + 2 = 18, 16 * 2 = 32, 16 - 2 = 14, 16 / 2 = 8
  
 
  */

public class Assignment4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int sum = N + M;
		int product = N * M;
		int diff = N - M;
		int quotient = N / M;
		System.out.println(sum + " " + product + " " + diff + " " + quotient);

		sc.close();
	}

}
