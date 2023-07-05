package ifelse3;

public class MCQ7 {
	public static void main(String[] args) {

		int x = 10;

		int y = 20;

		{

			y = 15;

			System.out.print(x + ", " + y);

		}

		{

			x = 15;

			System.out.print(" - " + x + ", " + y);

		}

		System.out.print(" - " + x + ", " + y);

	}

}