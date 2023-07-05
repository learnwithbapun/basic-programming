package ifelse;

import java.util.Scanner;

/*
 *Q5. Max of three

Problem Description
Write a program to input three numbers(A, B & C) from user and print the maximum element among A, B & C in each line.



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
Output 1:

7
Output 2:

100000


Example Explanation
Explanation 1:

Clearly, among 5, 6 and 7, 7 is maximum.
Explanation 2:

Clearly, among 1000, 10000 and 100000, 100000 is maximum.


T = O(1)
S = O(1)

 * */
public class Assignment5 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		 Scanner scn = new Scanner(System.in);
	        int num1 = scn.nextInt();
	        int num2 = scn.nextInt();
	        int num3 = scn.nextInt();
	        
	        if(num1 > num2 && num1 > num3) {
	            // if num1 is greater than num2 and num3 then it is max
	            System.out.println(num1);
	        } else if(num2 > num3) {
	            // if we are here that means num1 is out of fight, now check if num2 is greater than num3 then it is max
	            System.out.println(num2);
	        } else {
	            // only num3 is remaining, so it is max
	            System.out.println(num3);
	        }

	}
}
