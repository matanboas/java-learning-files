import java.util.Scanner;

public class Segev {

	public static void main(String[] args) {
		String[] nameAndAge = NameAge();
		int birthYear = Integer.parseInt(nameAndAge[1]);

		System.out.println("Hello "+nameAndAge[0]+", you are now "+(2020-birthYear)+", you will be "+(2028-birthYear)+" in 2028");
	}

	static String[] NameAge(){

		Scanner in = new Scanner(System.in);
		String[] nameAndAge = new String[2];

		System.out.print("what is your name? ");
		nameAndAge[0] = in.nextLine();

		System.out.print("what is your Birth year? ");
		nameAndAge[1] = in.nextLine();

		return nameAndAge;
	}
    
}
