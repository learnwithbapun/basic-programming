package onedarray2;

/*
 * 
 * Given an
		array
		at and at k find if k is present in
		the array if it preent return true else return false
 * 
 */
public class LessonQuestion1 {
	static boolean findElement(int arr[], int k) {

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == k) {
				return true;
			}
		}

		return false;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		boolean searchResult = findElement(arr, 3);
		System.out.println(searchResult);
	}
}
