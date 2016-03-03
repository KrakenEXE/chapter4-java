package projectNine;

import java.util.Scanner;

public class ChooseMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner( System.in);
		
		System.out.print("1 = Air || 2 = Water || 3 = Steel >> ");
		Double choice = Double.parseDouble(scanner.nextLine());
		
		System.out.print("What's the distance >> ");
		Double distance = Double.parseDouble(scanner.nextLine());
		
		DetermineSpeed timeOfSpeed = new DetermineSpeed(distance, choice);
		
		if(timeOfSpeed.getChoice() == 1){
			System.out.print("It would take "+timeOfSpeed.getSpeedInAir()+" in air");
		}
		else if(timeOfSpeed.getChoice() == 2){
			System.out.print("It would take "+timeOfSpeed.getSpeedInWater()+" in water");
		}
		else if(timeOfSpeed.getChoice() == 3){
			System.out.print("It would take "+timeOfSpeed.getSpeedInSteel()+" in steel");
		}
	}

}
