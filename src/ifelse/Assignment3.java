package ifelse;

import java.util.Scanner;



/* 
 * 

Q3. Percentage and Grade

Write a program to calculate the percentage (according to marks of a student) and grade (according to the percentage of a student). Five numbers(A, B, C, D & E) represent the marks of a student in 5 subjects which are out of 100. Print the percentage and the grade of the student.

If percentage >= 90% : Grade A
If percentage >= 80% but <90 : Grade B
If percentage >= 70% but <80: Grade C
If percentage >= 60% but <70: Grade D
If percentage >= 40% but <60: Grade E
If percentage < 40%: Grade F
NOTE: You have to take the lowest integer of the percentage. E.g. 90.8% will be treated as 90%.

Input Format:

There will be five lines of inputs as following:

The five lines contain the 5 subject marks of the student in numerical format.
Output Format:

The first line indicates the percentage in integer format.  

The next line displays the grade in string format.
Sample Input:

50   
60   
70   
80   
90
Sample Output:

70   
C  



T = O(1)
S = O(1)

 * */

public class Assignment3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int D = scanner.nextInt();
		int E = scanner.nextInt();

		int scored = A + B + C + D + E;
		
		float grade = (scored*100) / 500;
//		float grade = (scored /5);

		System.out.println(grade);
		
		if (grade >= 90) {
			System.out.println("A");
		} else if (grade >= 80 && grade < 90) {
			System.out.println("B");
		} else if (grade >= 70 && grade < 80) {
			System.out.println("C");
		} else if (grade >= 60 && grade < 70) {
			System.out.println("D");
		} else if (grade >= 40 && grade < 60) {
			System.out.println("E");
		} else if (grade < 40) {
			System.out.println("F");
		}

	}
}
