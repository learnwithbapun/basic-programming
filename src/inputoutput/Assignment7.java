package inputoutput;

import java.util.Scanner;

/*
 * Total Elapsed Cooking Time
S

Problem Description

You're going to write some code to help you cook a gorgeous lasagna from your favourite cookbook.
Now, you want to find the total number of minutes you've been cooking or the sum of your preparation time and the time the lasagna has already spent baking in the oven. The preparation time of one layer is 2 minutes.

Given the number of layers added to the lasagna and the number of minutes the lasagna has been baking in the oven, find the total elapsed cooking time (prep + bake) in minutes.

Input Format

Their are 2 lines in the input.

The first line contains the integer N denoting the number of layers.

The second line contains the integer M denoting the time the lasagna has already spent baking in the oven.

Output Format

Print in a single line the total elapsed cooking time.

Problem Constraints

1 <= N <= 20

0 <= M <= 40

Example Input

Input 1:-

3

20

Input 2:-

1

29

Example Output

Output 1:-

26

Output 2:-

31

Note: The problem constraints mean that when we test your code, the test cases used in the backend can have input values only within those constraints. You need not implement them in your code. You need to make sure your code will work for all such input values!


 */
public class Assignment7 {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     int M = sc.nextInt();
     int result = 2*N+M;
     System.out.println(result);
}
}
