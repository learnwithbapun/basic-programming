package whileloop2;

import java.util.Scanner;

/* NEED CLARITY ON THE BEST APPROACH
 * Q3. Count the digits

 * Problem Description
Mr. Q has a diary in which he has written a lot of numbers. He is confused about the number of digits in every number he has written. Mr. Q will provide the different numbers written in the diary and then you have to write a code to find the number of digits in every number he has written.

Note: Total different Numbers are T and for every number (let's say N) you need to find the total number of digits.

Problem Constraints

1 <= T <= 100
0 <= N <= 100000000
Input Format

The first line is the number T which denotes the total numbers written in the diary.
Next T lines contain an integer N for which you have to find the number of digits.
Output Format

For T different Numbers, Print the number of digits in T in different lines.</div>
Example Input

Input 1: 
2
0
1

Input 2:
2
100
10101
Example Output

Output 1:
1
1
Output 2:
3
5
Example Explanation

Explanation 1:
0 and 1 both have only one digit.
Explanation 2:
100 has three digits and 10101 has 5 digits.

 */

public class Assignment3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		int i = 1;
		while ( T > 0) {
			int count = 0;
			int inputNumber = scanner.nextInt();
			
			if(inputNumber == 0) {
				count++;
			}

			while (inputNumber != 0) {

				inputNumber /= 10;
				count++;
			}
			System.out.println(count);
			T--;
		}

	}
}

/*
 * Solution Provided by Anonymous
 * public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while (t > 0) {
            int N = scn.nextInt();
            int count = 0;

            if (N == 0) {
                System.out.println(1);
            } else {
                while (N > 0) {
                    count++;
                    N = N / 10;
                }
                System.out.println(count);
            }
            t--;
        }
    }
}
Still unable to solve the proble
 */
