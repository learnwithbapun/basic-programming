package string2;

//WAP to find the total number of vowels and return it 
// Number - counts = Consonent
public class LessonQuestion4 {
	static int countVowels(String string) {

		int count = 0;
		for (int i = 0; i <= string.length() - 1; i++) {
			char ch = string.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println(countVowels("mom"));
		System.out.println(countVowels("momo"));
		System.out.println(countVowels("momoo"));
	}
}
