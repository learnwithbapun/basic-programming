package inputoutput;
import java.util.Scanner;

/*
 * Q1. Concatenate Two Numbers
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given two numbers A and B. Concatenate the two numbers and print it.


Problem Constraints
1 <= A, B <= 104


Input Format
There are two input lines
The first line has a single integer A.
The second line has a single integer B.


Output Format
Print in a single line the concatenated number.


Example Input
Input 1:-
4
5
Input 2:-
16
2


Example Output
Output 1:-
45
Input 2:-
162


Example Explanation
Explanation 1:-
Concatenating 4 and 5 will be 45.
Explanation 2:-
Concatenation 16 and 2 is 162.


 */
public class Homework1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	      int N = sc.nextInt();
	      int M = sc.nextInt();
	      System.out.print(N+""+M);
	}

}
