package projectSeven;
import java.util.Scanner;
public class InputCalories {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner( System.in);
		
		System.out.print("Calories >>");
		double calories = Double.parseDouble(scanner.nextLine());
		
		System.out.print("Fat Grams >>");
		double fatGrams = Double.parseDouble(scanner.nextLine());
		
		VariableContainer foodItem = new VariableContainer(calories, fatGrams);
		
		System.out.println("Calories from fat >> "+foodItem.getCaloriesFromFat());
		if(foodItem.getPercentageOfCaloriesFromFat() < 0.3){
			System.out.println("Item is low in fat");
		}
		else if(foodItem.getPercentageOfCaloriesFromFat() > 1){
			System.out.println("Error numbers are invalid");
		}
	}

}
