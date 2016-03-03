package projectOne;
import java.util.Scanner;
public class checkNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in);
		
		System.out.print("Input a number between 1 to 10 >> ");
		int inputInteger = Integer.parseInt(scanner.nextLine());
		
		String numeral = "";
		
		switch(inputInteger){
		case 1: numeral = "I";
		
		break;
		case 2: numeral = "II";
		break;
		case 3: numeral = "III";
		break;
		case 4: numeral = "IV";
		break;
		case 5: numeral = "V";
		break;
		case 6: numeral = "VI";	
		break;
		case 7: numeral = "VII";		
		break;
		case 8: numeral = "VIII";
		break;
		case 9: numeral = "IX";
		break;
		case 10: numeral = "X";
		break;
		
		
		}
		System.out.println("Your numeral is "+numeral);
	}

}
