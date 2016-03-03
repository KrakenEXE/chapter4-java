package projectThree;

import java.util.Scanner;

public class InputTests {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in);
		
		System.out.print("Enter first test score >> ");
		Double test1 = Double.parseDouble(scanner.nextLine());
		
		System.out.print("Enter second test score >> ");
		Double test2 = Double.parseDouble(scanner.nextLine());
		
		System.out.print("Enter third test score >> ");
		Double test3 = Double.parseDouble(scanner.nextLine());
		
		TestScores average = new TestScores(test1, test2, test3);
		
		System.out.print("Your average is "+average.getAverage()+" with a letter grade of "+average.getGrade());
	}

}
