package week1lesson3;

/**
 * @author haftomtesfay
 *
 */
public class USMail extends Carrier {

	public USMail(String desc, double weight, String zone, String sender) {
		super(desc, weight, zone, sender);
		// TODO Auto-generated constructor stub
	}

	public double calculateRate() {
		if (weight <= 3)
			return 1;
		else
			return 0.55 * weight;
	}

}