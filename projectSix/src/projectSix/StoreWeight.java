package projectSix;
import java.util.Scanner;

public class StoreWeight {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in);
		
		System.out.print("Enter package weight >> ");
		Double packageWeight = Double.parseDouble(scanner.nextLine());

		DeterminePrice newPackage = new DeterminePrice(packageWeight);
		
		System.out.print("$"+newPackage.getPriceOfShipping());
	}

}
