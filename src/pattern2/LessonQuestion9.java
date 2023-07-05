package pattern2;

import java.util.Scanner;

//Given N print the following pattern
/*
12
************************
***********  ***********
**********    **********
*********      *********
********        ********
*******          *******
******            ******
*****              *****
****                ****
***                  ***
**                    **
*                      *
*                      *
**                    **
***                  ***
****                ****
*****              *****
******            ******
*******          *******
********        ********
*********      *********
**********    **********
***********  ***********
************************


 */

public class LessonQuestion9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N - i + 1; j++) {
				System.out.print("*");
			}

			for (int j = 1; j <=  2*(i - 1); j++) {
				System.out.print(" ");
			}
			for (int m = 1; m <= N - i + 1; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			for (int j = 1; j <=  2*(N - i); j++) {
				System.out.print(" ");
			}
			for (int m = 1; m <= i; m++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
