package ifelse3;

import java.util.Scanner;

public class Assignment1 {
	
	/*
	 * 
	 * 
	 * Q1. Confusion In Electricity Bill
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Mr. T got the Electricity bill of his house. He felt that the bill amount was too much. He come to you to understand the relation between amount and number of units with Electricity bill.


Instructions are give on Electricity biil that :
1. For first 50 units Rs. 0.50/unit.
2. For next 100 units Rs. 0.75/unit.
3. For next 100 units Rs. 1.20/unit.
4. For above 250 units Rs. 1.50/unit.
5. An additional surcharge of 20% is added to the bill.

NOTE: As the electricity bill can have any real value (floating point), you have to tell the floor value of the bill. Floor value of a floating point is the closest integer less than or equal to that value. For eg. Floor value of 2.91 is 2.

To avoid manual calculation again and again, You have to write a code which take number of Unit (suppose N) from user and print the amount.



Problem Constraints
0 < N <= 100000


Input Format
Take an integer N from user


Output Format
Print the amount for that much unit


Example Input
Input 1 :
150

Input 2 :
4


Example Output
Output 1 :
120

Output 2 :
2


Example Explanation
Explanation 1:
For first 50 units, the bill is (Rs 0.5/unit) * (50 unit) = Rs 25
For next 100 units, the bill is (Rs 0.75/unit) * (100 unit) = Rs 75
Bill amount without additional surcharge = Rs 100
Total Bill amount with additional surcharge = Rs (100 + 0.20 * 100) = Rs 120

Explanation 2:
Bill without additional surcharge (Rs 0.5/unit) * (4 unit) = Rs 2
Total Bill amount with additional surcharge = Rs (2 + 0.20 * 2) = Rs 2.4
Floor value of Bill amount = Rs 2


/*
 * 
 * Time complexity - O(1), as only if conditions are being used and no for loop

Space complexity - O(1), as only fixed number of variables are being used.
 */

	public static void main(String[] args) {

//		Scalar Solution :
		 Scanner scn = new Scanner(System.in);
	        int unit = scn.nextInt();
	        double amt = 0;
	        if(unit <= 50) {
	            // Here unit must be in Range (0, 50]
	            amt += unit * 0.5;          // for first 50
	        } else if(unit <= 150) {     
	            // Here unit must be in Range (50, 150]
	            amt += 50 * 0.5;            // for first 50
	            amt += (unit - 50) * 0.75;  // for 50 < unit
	        } else if(unit <= 250) {
	            // Here unit must be in Range (150, 250]
	            amt += 50 * 0.5;            // for first 50
	            amt += 100 * 0.75;          // for 50 < unit and unit <= 150
	            amt += (unit - 150) * 1.2;  // for 150 < unit
	        } else {
	            // Here unit must be in Range (250 to N)
	            amt += 50 * 0.5;            // for first 50
	            amt += 100 * 0.75;          // for 50 < unit and unit <= 150
	            amt += 100 * 1.2;           // for 150 < unit and unit <= 250 
	            amt += (unit - 250) * 1.5;  // for 250 < unit
	        }
	        // additional 20% surcharge on overall amount
	        amt += (amt * 20) / 100; 
	        System.out.println((int)amt);
	    }
		// Scalar Solution

		/*
		 * Scanner scanner = new Scanner(System.in); int units = scanner.nextInt();
		 * 
		 * int surAmount; if (units <= 50) { double slab1 = units * 0.5; surAmount =
		 * (int) (slab1 + (slab1 * 20) / 100); System.out.println(surAmount); } else if
		 * (units > 50 && units <= 150) { double slab2 = (50 * 0.5 + ((units - 50) *
		 * 0.75)); surAmount = (int) (slab2 + slab2 * 20 / 100);
		 * System.out.println(surAmount); } else if (units > 150 && units <= 250) {
		 * 
		 * double slab3 = ((50 * 0.5) + (100 * 0.75) + ((units - 150) * 1.20));
		 * surAmount = (int) (slab3 + slab3 * 20 / 100); System.out.println(surAmount);
		 * } else if (units > 250) {
		 * 
		 * double slab4 = ((50 * 0.5) + (100 * 0.75) + (100 * 1.20) + ((units - 250) *
		 * 1.50));
		 * 
		 * surAmount = (int) (slab4 + slab4 * 20 / 100); System.out.println(surAmount);
		 * }
		 */
	}

