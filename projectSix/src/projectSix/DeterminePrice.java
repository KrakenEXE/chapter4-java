package projectSix;

public class DeterminePrice {

	private double weightOfPackage;
	private double priceOfShipping;
	
	public DeterminePrice(double weightOfPackage){
		if(weightOfPackage <= 2){
			priceOfShipping = 1.1;
		}
		else if(weightOfPackage >= 2.1 && weightOfPackage <= 6){
			priceOfShipping = 2.2;
		}
		else if(weightOfPackage >=6.1 && weightOfPackage <= 10){
			priceOfShipping = 3.7;
		}
		else if(weightOfPackage >=10.1){
			priceOfShipping = 4.8;
		}
	}

	public double getWeightOfPackage() {
		return weightOfPackage;
	}

	public void setWeightOfPackage(double weightOfPackage) {
		this.weightOfPackage = weightOfPackage;
	}

	public double getPriceOfShipping() {
		return priceOfShipping;
	}

	public void setPriceOfShipping(double priceOfShipping) {
		this.priceOfShipping = priceOfShipping;
	}
}
