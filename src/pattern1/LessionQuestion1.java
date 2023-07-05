package pattern1;

import java.util.Scanner;


/* 
 * Given N 
 * A SQUARE OF START of SIZE N*N

****
****
****
****
 
 */
public class LessionQuestion1 {

	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		for(int row = 1; row <= n; row ++) {
			
			for(int col = 1; col <= n ;  col ++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
