package pattern1;

import java.util.Scanner;


/*  6

 GIVEN  N IN INPUT AND PRINT THE FOLLOWING PATTERN
*
*2
*2*
*2*4
*2*4*
*2*4*6
*/
public class Pattern5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		
		for(int row = 1; row <= N; row ++) {
			for (int col =1 ; col <= row; col++) {
				
				if(col %2 == 0) {
					System.out.print(col);
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
