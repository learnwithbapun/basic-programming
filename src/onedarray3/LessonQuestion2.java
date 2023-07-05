package onedarray3;

/*
 * 
 * Given an array in which all elements are in pair , coming twice except one return  the single element if not return -1



 */
public class LessonQuestion2 {

	static int checkSingle(int arr[]) {
		
		for (int i = 0; i <= arr.length - 1; i++) {
			int elem = arr[i];
			int count = 0;
			for (int j = 0; j <= arr.length - 1; j++) {
				if (elem == arr[j])
					count++;
			}
			if (count == 1) {
				return elem;
			}

		}

		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6 };
		int b = checkSingle(arr);
		System.out.println(b);
	}

}
