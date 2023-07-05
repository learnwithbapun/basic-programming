package pattern2;

import java.util.Scanner;

//Given N print the following pattern
/*
-----------*
----------**
---------***
--------****
-------*****
------******
-----*******
----********
---*********
--**********
-***********
************
*
 */

public class LessonQuestion4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		for(int i =1; i <= N; i++) {
			for(int j =1; j<= N-i; j++) {
				System.out.print("-");
			}
			for(int k =1; k <=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
