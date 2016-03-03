package projectSeven;

public class VariableContainer {

	private double calories;
	private double fatGrams;
	private double caloriesFromFat;
	private double percentageOfCaloriesFromFat;
	public VariableContainer(double calories,double fatGrams){
		caloriesFromFat = fatGrams * 9;
		percentageOfCaloriesFromFat = caloriesFromFat / calories;
	}
	public double getCalories() {
		return calories;
	}
	public void setCalories(double calories) {
		this.calories = calories;
	}
	public double getFatGrams() {
		return fatGrams;
	}
	public void setFatGrams(double fatGrams) {
		this.fatGrams = fatGrams;
	}
	public double getCaloriesFromFat() {
		return caloriesFromFat;
	}
	public void setCaloriesFromFat(double caloriesFromFat) {
		this.caloriesFromFat = caloriesFromFat;
	}
	public double getPercentageOfCaloriesFromFat() {
		return percentageOfCaloriesFromFat;
	}
	public void setPercentageOfCaloriesFromFat(double percentageOfCaloriesFromFat) {
		this.percentageOfCaloriesFromFat = percentageOfCaloriesFromFat;
	}
}
