package projectFour;
import java.util.Scanner;
import java.text.NumberFormat;

public class applyDiscount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in);
		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
		
		System.out.print(" How many units sold >> ");
		double unitsSold = Double.parseDouble (scanner.nextLine());
		double discount = 1;
		double price = 99.0;
		
		if(unitsSold>=10 && unitsSold <=19){
			discount = 0.80;
		}
		else if(unitsSold>=20 && unitsSold <=49){
			discount = 0.70;
		}
		else if(unitsSold>=50 && unitsSold <=99){
			discount = 0.60;
		}
		else if(unitsSold >=100){
			discount = 0.50;
		}
		
		String totalPrice = defaultFormat.format(unitsSold * price * discount);
		System.out.println("The total for "+unitsSold+" is "+totalPrice);
	}

}
