package string2;
//WAP to check whether a number is PALINDROME OR NOT
public class LessonQuestion1 {
	static boolean isPalindrome(String string) {
		String revstring = "";

		for (int i = string.length() - 1; i >= 0; i--) {
			revstring += string.charAt(i);
		}

		if (revstring.equalsIgnoreCase(string)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		boolean b = isPalindrome("MADAM");
		System.out.println(b);
	}

}
