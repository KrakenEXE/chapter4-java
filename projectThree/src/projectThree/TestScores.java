package projectThree;

public class TestScores {

	private double test1;
	private double test2;
	private double test3;
	private double average;
	private String grade;
	public TestScores(double test1, double test2, double test3){
		this.test1 = test1;
		this.test2 = test2;
		this.test3 = test3;
		
		
	}
	
	public double getTest1() {
		return test1;
	}
	public void setTest1(double test1) {
		this.test1 = test1;
	}
	public double getTest2() {
		return test2;
	}
	public void setTest2(double test2) {
		this.test2 = test2;
	}
	public double getTest3() {
		return test3;
	}
	public void setTest3(double test3) {
		this.test3 = test3;
	}

	public double getAverage() {
		average = ((test1 + test2 + test3)/3);
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public String getGrade() {
		if(average <=59){
			grade = "F";
		}
		else if(average >=60 && average <= 69){
			grade = "D";
		}
		else if(average >=70 && average <=79){
			grade = "C";
		}
		else if(average >=80 && average <= 89){
			grade = "B";
		}
		else if(average >=90 && average <=100){
			grade = "A";
		}
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
}
