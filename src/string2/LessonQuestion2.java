package string2;

//WAP to check whether a number is PALINDROME OR NOT without using additional string
//TWO Pointer technique
public class LessonQuestion2 {
	static boolean isPalindrome(String string) {
		int n = string.length();
		int i = 0;
		int j = n - 1;
		while (i < j) {

			char ch1 = string.charAt(i);
			char ch2 = string.charAt(j);

			if (ch1 != ch2) {
				return false;
			}
			i++;
			j--;
		}
		return true;

	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("MADAM"));
	}

}
