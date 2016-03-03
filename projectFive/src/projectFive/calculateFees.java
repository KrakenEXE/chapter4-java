package projectFive;
import java.util.Scanner;
import java.text.NumberFormat;

public class calculateFees {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in);
		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
		
	double checkFee = 0;
	double lowBalanceFee= 10;
	System.out.print("How many checks were wrote >> ");
	double amountOfChecks = Double.parseDouble(scanner.nextLine())
			;
	System.out.print("What's the balance of your account >> ");
	double bankBalance = Double.parseDouble(scanner.nextLine());
	
	if(amountOfChecks <= 19){
		checkFee = 0.10;
	}
	else if(amountOfChecks >= 20 && amountOfChecks <=39){
		checkFee = 0.08;
	}
	else if(amountOfChecks >=40 && amountOfChecks<=59){
		checkFee = 0.06;
	}
	else if(amountOfChecks >=60){
		checkFee = 0.04;
	}
	
	if(bankBalance < 400){
		lowBalanceFee = 25;
	}
	
	double totalBalance = bankBalance- ((amountOfChecks* checkFee)+lowBalanceFee);
	
	System.out.println("Your balance is "+defaultFormat.format(totalBalance)+" your check fee was "+defaultFormat.format(checkFee)+" per check with "+amountOfChecks+" total checks");
	}

}
