package inputoutput;
/*
 * Number of bills
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Your friend Rahul plans to visit exotic countries all around the world. Sadly, Rahul's math skills aren't good.
He's pretty worried about being scammed by currency exchanges during his trip - and he wants you to make a currency calculator for him. Here are his specifications for the app:

Given the total budget and the value of a single bill, your need to print the no of new currency bills that you can receive within the given budget.

In other words: How many whole bills of new currency fit into the amount of old currency you have in your budget?

Remember -- you can only receive whole bills, not fractions of bills, so remember to divide accordingly. Effectively, you are rounding down to the nearest whole bill/denomination.

Input Format

First line contains an real number N denoting the total budget.

Second line contains an integer M denoting the value of a single bill.

Output Format

Print in a single line denoting the total numbers of bills which should be an integer.

Problem Constraints

1 <= N <= 1000.00

1 <= M <= 100

Example Input

Input:-

126.3

5

Example Output

Output:-

25

Note: The problem constraints mean that when we test your code, the test cases used in the backend can have input values only within those constraints. You need not implement them in your code. You need to make sure your code will work for all such input values!
 */
import java.util.Scanner;

public class Homework8 {
public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);
     float N = sc.nextFloat();
     int M = sc.nextInt();
     int result = (int)N/M;
     System.out.println(result);
}
}
