package string1;

import java.util.Scanner;

//GIVEN  A STRING WAF to return total number of UPPERCASE caracter in the STRING
public class LessonQuestion2 {

	static int checkUpperCase(String string) {
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
				 count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(checkUpperCase(str));
	}
}
