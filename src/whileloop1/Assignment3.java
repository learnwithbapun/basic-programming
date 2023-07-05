package whileloop1;

import java.util.Scanner;
/*
 * Q3. Odd Game
 * 
 * Problem Description
Write a program to print all odd numbers from 1 to N where you have to take N as input from user.



Problem Constraints
1 <= N <= 2000000



Input Format
A single line representing N




Output Format
All odd numbers from 1 to N separated by spaces.



Example Input
Input 1:

5
Input 2:

10


Example Output
Output 1:

1 3 5 
Output 2:

1 3 5 7 9 
 */
public class Assignment3 {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int i = 1;
    while(i <= n) {
        System.out.print(i + " ");
        i += 2;  
    } 
}
}