package onedarray2;

/*
 * 
 * Given A[] and  find the frequency of k in the array.
 * 
of k in the assay
 * 
 */
public class LessonQuestion2 {
	static int fequency(int arr[], int k) {
		int count = 0;

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == k) {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0,3 };
		int searchResult = fequency(arr, 3);
		System.out.println(searchResult);
	}
}
