package ifelse;

import java.util.Scanner;

/*
 * 
 *Q4. Min of three


Problem Description
Write a program to input three numbers(A, B & C) from user and print the minimum element among A, B & C in each line.



Problem Constraints
1 <= A <= 1000000

1 <= B <= 1000000

1 <= C <= 1000000



Input Format
First line is a single integer A.
Second line is a single integer B.
Third line is a single integer C.



Output Format
One line containing an integer as per the question.



Example Input
Input 1:

5 
6 
7
Input 2:

1000 
10000 
100000


Example Output
Output 1:-
5
Output 2:-
1000


Example Explanation
Explanation 1:

Clearly, among 5, 6 and 7, 5 is minimum.
Explanation 2:

Clearly, among 1000, 10000 and 100000, 1000 is minimum.



T = O(1)
S = O(1)


 * */
public class Homework3 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		int num3 = scn.nextInt();

		if (num1 < num2 && num1 < num3) {
			// if num1 is smaller from num2 and num3, then num1 is minimum
			System.out.println(num1);
		} else if (num2 < num3) {
			// if we are here that means, num1 is not min, now fight is only between num2
			// and num3
			System.out.println(num2);
		} else {
			// here only num3 is remain so it is min
			System.out.println(num3);
		}
	}
}
