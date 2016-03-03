package projectEight;

import java.util.Scanner;

public class InportRunners {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in);
		
		System.out.print("Enter runner 1 name >> ");
		String runnerOneName = scanner.nextLine();
		
		System.out.print("Enter runner 1 time >> ");
		Double runnerOneTime = Double.parseDouble(scanner.nextLine());
		
		System.out.print("Enter runner 2 name >> ");
		String runnerTwoName = scanner.nextLine();
		
		System.out.print("Enter runner 2 time >> ");
		Double runnerTwoTime = Double.parseDouble(scanner.nextLine());
		
		System.out.print("Enter runner 3 name >> ");
		String runnerThreeName = scanner.nextLine();
		
		System.out.print("Enter runner 3 time >> ");
		Double runnerThreeTime = Double.parseDouble(scanner.nextLine());
		
		runnerData runnerOne = new runnerData(runnerOneName, runnerOneTime);
		runnerData runnerTwo = new runnerData(runnerTwoName, runnerTwoTime);
		runnerData runnerThree = new runnerData(runnerThreeName, runnerThreeTime);
		
		if(runnerOne.getRunnerTime()< runnerTwo.getRunnerTime() && runnerOne.getRunnerTime() < runnerThree.getRunnerTime()){
			//runner one = 1
			System.out.println("Runner one is First");
			if(runnerTwo.getRunnerTime()<runnerThree.getRunnerTime()){
				//runner two = 2
				System.out.println("Runner two is Second");
				//runner three = 3
				System.out.println("Runner three is Third");
			}
			else{
				//runner three = 2
				System.out.println("Runner three is Second");
				//runner two = 3
				System.out.println("Runner two is Third");
			}
		}
		else if(runnerTwo.getRunnerTime()< runnerOne.getRunnerTime() && runnerTwo.getRunnerTime() < runnerThree.getRunnerTime()){
			//runner two = 1
			System.out.println("Runner two is First");
			if(runnerThree.getRunnerTime()<runnerOne.getRunnerTime()){
				//runner three = 2
				System.out.println("Runner three is Second");
				//runner one = 3
				System.out.println("Runner one is Third");
			}
			else{
				//runner one = 2
				System.out.println("Runner one is Second");
				//runner three = 3
				System.out.println("Runner three is Third");
			}
		}
		else if(runnerThree.getRunnerTime()< runnerTwo.getRunnerTime() && runnerThree.getRunnerTime() < runnerOne.getRunnerTime()){
			//runner three = 1
			System.out.println("Runner three is First");
			if(runnerTwo.getRunnerTime()<runnerOne.getRunnerTime()){
				//runner two = 2
				System.out.println("Runner two is Second");
				//runner one = 3
				System.out.println("Runner one is Third");
			}
			else{
				//runner one = 2
				System.out.println("Runner one is Second");
				//runner two = 3
				System.out.println("Runner two at Third");
			}
		}
	}

}
