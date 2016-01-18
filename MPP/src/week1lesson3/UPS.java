package week1lesson3;

/**
 * @author haftomtesfay
 *
 */
	
	public class UPS extends Carrier{

	public UPS(String name, double rate) {
		super(name, rate);
		// TODO Auto-generated constructor stub
	}
	
	public double calculateCost(double noPounds) {
		// TODO Auto-generated method stub
		
		double rateups = 0.45*noPounds;
		return rateups;
	}

	
}
