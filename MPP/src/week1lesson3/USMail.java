package week1lesson3;

/**
 * @author haftomtesfay
 *
 */
public class USMail extends Carrier {

	public USMail(String name, double rate ) {
		super(name, rate);
		// TODO Auto-generated constructor stub
	}

	public double calculateCost(double noPounds) {
		double rateusmail = 0;
		
		if(noPounds <= 3) 
			 rateusmail = 1.00;
		else if (noPounds >3)
			rateusmail=0.55*noPounds;
		return rateusmail;
	}

}
