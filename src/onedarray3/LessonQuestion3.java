package onedarray3;

/*
 * 
 * 
   Given an array and a value k Return true  if there is pair for which A[i]+A[jj == k


 */
public class LessonQuestion3 {

	static boolean pairSumCheck(int A[], int N, int k) {

		for (int i = 0; i <= N - 1; i++) {
			for (int j = 0; j <= N - 1; j++) {
				if (A[i] + A[j] == k & i != j) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6 };
		boolean b = pairSumCheck(arr, 11, 33);
		System.out.println(b);
	}

}
