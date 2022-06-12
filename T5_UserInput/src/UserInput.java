import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter some number");
		int userInputNumber = scan.nextInt();
		
		System.out.println("Entered value is" + userInputNumber);
	
		Scanner scan1 = new Scanner (System.in);
		System.out.println("Enter some number");
		double userInputNumberDouble = scan2.nextDouble();
		
		System.out.println("Entered value is" + userInputNumberDouble);
		
		Scanner scan2 = new Scanner (System.in);
		System.out.println("Enter some number");
		String userInput = scan2.nextLine();
		
		System.out.println("Entered value is" + userInput);
	}

}
