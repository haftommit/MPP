package week1lesson3;

/**
 * @author haftomtesfay
 *
 */
public class FedEx extends Carrier {

	public FedEx(String desc, double weight, String zone, String sender) {
		super(desc, weight, zone, sender);
		// TODO Auto-generated constructor stub
	}

	public double calculateRate() {
		zone = zone.toLowerCase();
		if (zone.equals("IA") || zone.equals("MT") || zone.equals("OR") || zone.equals("CA"))
			return 0.35 * weight;
		else if (zone.equals("TX") || zone.equals("UT"))
			return 0.3 * weight;
		else if (zone.equals("FL") || zone.equals("MA") || zone.equals("OH"))
			return 0.55 * weight;
		else
			return 0.43 * weight;
	}

}
