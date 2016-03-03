package projectNine;

public class DetermineSpeed {

	private double distance;
	private double speedInAir;
	private double speedInWater;
	private double speedInSteel;
	private double choice;
	
	public DetermineSpeed(double distance, double choice){
		this.distance = distance;
		this.choice = choice;
	}
	
	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getSpeedInAir() {
		speedInAir = distance/1100;
		return speedInAir;
	}

	public void setSpeedInAir(double speedInAir) {
		this.speedInAir = speedInAir;
	}

	public double getSpeedInWater() {
		speedInWater = distance/4900;
		return speedInWater;
	}

	public void setSpeedInWater(double speedInWater) {
		this.speedInWater = speedInWater;
	}

	public double getSpeedInSteel() {
		speedInSteel = distance/16400;
		return speedInSteel;
	}

	public void setSpeedInSteel(double speedInSteel) {
		this.speedInSteel = speedInSteel;
	}

	public double getChoice() {
		return choice;
	}

	public void setChoice(double choice) {
		this.choice = choice;
	}
}
