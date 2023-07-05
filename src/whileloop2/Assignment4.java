package whileloop2;

import java.util.Scanner;

/*
 * Q4. Sum Of Odd & Even Digits In A Number
 * You have a number N, you have to write a code to find odd digit sum and even digit sum from given number and print it.


Problem Constraints
0 < N < 1000000000


Input Format
An Integer N


Output Format
In first line, print ("Sum of Odd Digit : x"), x is sum of odd digits
In second line, print ("Sum of Even Digit : y"), y is sum of even digits


Example Input
Input 1 :
8563724

Input 2 :
4524126


Example Output
Output 1 :
Sum of Odd Digit : 15
Sum of Even Digit : 20

Output 2 :
Sum of Odd Digit : 6
Sum of Even Digit : 18


Example Explanation
Explanation 1 :
In number 8563724, Digit 5, 3 and 7 are odd and sum is equal to 15, and 8, 6, 2 and 4 are even and sum is equal to 20

Explanation 2 :
In number 4524126, Digit 5 and 1 are odd and sum is equal to 6, and 4, 2, 4, 2, and 6 are even and sum is equal to 18


 */
public class Assignment4 {
	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
			int N = scanner.nextInt();

			int evenSum = 0;
			int oddSum = 0;
			int modNum;
			while (N > 0) {
				modNum = N % 10;
				if (modNum % 2 == 0) {
					evenSum += modNum;

				} else {
					oddSum  += modNum;
				}
				N = N / 10;

			}
			System.out.println("Sum of Odd Digit : " + oddSum);
			System.out.println("Sum of Even Digit : " + evenSum);
		}
	}
