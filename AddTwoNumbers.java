import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {

		int finalNumber = addTwoNumbers();

		System.out.println(finalNumber);

	}

	private static int addTwoNumbers() {

		Scanner in = new Scanner(System.in);

		System.out.println("insert two numbers");

		int firstNumber = in.nextInt();
		int seconedNumber = in.nextInt();

		return firstNumber + seconedNumber;
	}
}