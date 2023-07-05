package pattern1;

import java.util.Scanner;

/*
 * 12
***********
**********
*********
********
*******
******
*****
****
***
**
*
 */

public class LessonQuestion5 {
	/*
	 * 12
*
*2
*2*
*2*4
*2*4*
*2*4*6
*2*4*6*
*2*4*6*8
*2*4*6*8*
*2*4*6*8*10
*2*4*6*8*10*
*2*4*6*8*10*12
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				if(j % 2==0) {
					System.out.print(j);
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();

		}
	}
}
