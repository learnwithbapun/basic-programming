package onedarray2;

/*
Qb Given A[] and k find the difference between
adjacent pairs if the differ equal k return true else return false.

 * 
 */
public class LessonQuestion3 {
	static boolean checkDiff(int arr[], int k) {

		// Tricky one
		for (int i = 0; i <= arr.length - 2; i++) {
			if (arr[i + 1] - arr[i] == k) {
				return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 3 };
		boolean searchResult = checkDiff(arr, 15);
		System.out.println(searchResult);
	}
}
