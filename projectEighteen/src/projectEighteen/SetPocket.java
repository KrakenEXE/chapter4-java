package projectEighteen;

import java.util.Scanner;

public class SetPocket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner( System.in);
		
		System.out.print("Pocket Number >> ");
		Integer pockerNumber = Integer.parseInt(scanner.nextLine());
		
		RoulettePocket newPocket = new RoulettePocket(pockerNumber);
		
		System.out.print(newPocket.getPocketColor());
	}

}
