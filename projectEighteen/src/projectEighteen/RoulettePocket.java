package projectEighteen;

public class RoulettePocket {

	private String pocketColor;
	private int pocketNumber;
	public RoulettePocket(int pocketNumber) {
		this.pocketNumber = pocketNumber;
	}

	public String getPocketColor() {
		if(pocketNumber == 0 ){
			pocketColor = "green";
		}
		else if(pocketNumber >= 1 && pocketNumber <= 10 ){
			if(pocketNumber == 1 || pocketNumber == 3 || pocketNumber == 5 || pocketNumber == 7 || pocketNumber == 9){
				pocketColor = "red";
			}
			else{
				pocketColor = "black";
			}
		}
		else if(pocketNumber >= 11 && pocketNumber <= 18 ){
			if(pocketNumber == 11 || pocketNumber == 13 || pocketNumber == 15 || pocketNumber == 17){
				pocketColor = "black";
			}
			else{
				pocketColor = "red";
			}
		}
		else if(pocketNumber >= 19 && pocketNumber <= 28){
			if(pocketNumber == 19 || pocketNumber == 21 || pocketNumber == 23 ||pocketNumber == 25 ||pocketNumber == 27){
				pocketColor = "red";
			}
			else{
				pocketColor = "black";
			}
		}
		else if(pocketNumber >= 29 && pocketNumber <= 36 ){
			if(pocketNumber == 29 || pocketNumber == 31 || pocketNumber == 33 || pocketNumber == 35){
				pocketColor = "black";
			}
			else{
				pocketColor = "red";
			}
		}
		else {
			pocketColor ="Invalid number";
		}
		return pocketColor;
	}

	public void setPocketColor(String pocketColor) {
		this.pocketColor = pocketColor;
	}

	public int getPocketNumber() {
		return pocketNumber;
	}

	public void setPocketNumber(int pocketNumber) {
		this.pocketNumber = pocketNumber;
	}
}
