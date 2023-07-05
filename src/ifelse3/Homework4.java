package ifelse3;

import java.util.Scanner;
/*
 * Q3. Find Largest of Three


Problem Description
Mr. ST is playing a game. There is a buket and it have 3 slips.
Target is that you have to check all the slips and show him the slip with max number.


Problem Constraints
-1000000 <= N1, N2, & N3 <= 1000000


Input Format
First line : N1 Integer
Second line : N2 Integer
Third line : N3 Integer


Output Format
Print Largest number between N1, N2 and N3
i.e. if num is largest then print "num is largest number".


Example Input
Input 1 :
190
176
201

Input 2 :
-43
-23
1


Example Output
Output 1 :
201 is largest number

Output 2 :
1 is largest number


Example Explanation
Explanation 1 :
201 is maximum among 190, 176 and 201

Explanation 2 :
1 is maximum among -43, -23 and 1


 */
public class Homework4 {
	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		int n1 = sca.nextInt();
		int n2 = sca.nextInt();
		int n3 = sca.nextInt();

		if (n1 > n2 && n1 > n3) {
			System.out.println(n1 + " is largest number");
		} else {
			if (n2 > n3) {
				System.out.println(n2 + " is largest number");
			} else {
				System.out.println(n3 + " is largest number");
			}
		}
	}
}