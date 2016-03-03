package projectEight;

public class runnerData {

	private String runnerName;
	private double runnerTime;
	
	public runnerData(String runnerName, double runnerTime){
		this.runnerName = runnerName;
		this.runnerTime = runnerTime;
		
		
	}

	
	public String getRunnerName() {
		return runnerName;
	}

	public void setRunnerName(String runnerName) {
		this.runnerName = runnerName;
	}

	public double getRunnerTime() {
		return runnerTime;
	}

	public void setRunnerTime(double runnerTime) {
		this.runnerTime = runnerTime;
	}
}
