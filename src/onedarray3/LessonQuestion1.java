package onedarray3;
/*
 * 
 * Given an array
return true if A[] is in
strictly  increasing order else return false


3 5 7 9 12 true
3 5 6 9 12 true
3 5 10 18 15 false
5 5 7 7 12 false

 */
public class LessonQuestion1 {

	static boolean checkIncrOrder(int arr[]) {

		for (int i = 0; i <= arr.length - 2; i++) {
			if (arr[i + 1] <= arr[i]) {
				return false;
			} 
		}
		return true;
	}

	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8};
		boolean b  = checkIncrOrder(arr);
		System.out.println(b);
	}

}
