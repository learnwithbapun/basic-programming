package string1;

import java.util.Scanner;

public class LessonQuestion1 {

	public static void main(String[] args) {

		String str = "Hello";
		System.out.println(str.length());

		char[] charArray = str.toCharArray();
		System.out.println(str.charAt(4));

		String ste = "Hey There";
//		System.out.println(ste.length);
		System.out.println(ste.length());

		char ch = 'A';
		System.out.println(ch);
//		ch++;
//		System.out.println(ch);

//		System.out.println(ch++);
//		System.out.println(++ch);
		System.out.println(ch + 1); // 65+1 = 66
		

		char ch1 = 65;
		System.out.println(ch1);
		
		
		char ch2 = 23222;
		System.out.println(ch2);
		
		int ch3 = 'A';
		System.out.println(ch3);
		
		char ch4 = 'A' + 'E';
		System.out.println("=========="+ch4+"========");
		
	Scanner scanner = new Scanner(System.in);
	String input = scanner.next();
	System.out.println(input);
	String input1 = scanner.nextLine();
	System.out.println(input1);
	
	
		

	}
}
