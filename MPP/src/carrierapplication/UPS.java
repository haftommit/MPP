package carrierapplication;

/**
 * @author haftomtesfay
 *
 */

public class UPS extends Carrier {
	
	private static final double  RATE = 0.45;
	
	public UPS(String desc, double weight, String zone, String sender) {
		super(desc, weight, zone,sender);
		// TODO Auto-generated constructor stub
	}

	public double calculateRate(){
		
		return RATE * weight;
	}

}