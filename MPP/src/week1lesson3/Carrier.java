package week1lesson3;

/**
 * @author haftomtesfay
 *
 */
public abstract class Carrier {

	protected String description;
	protected double weight;
	protected String zone;
	protected String sender;

	public Carrier(String desc, double weight, String zone, String sender) {

		this.description = desc;
		this.weight = weight;
		this.zone = zone;
		this.sender = sender;
	}

	public abstract double calculateRate();
	public String toString() {
		return String.format("%10s %6.2f %20s ", this.calculateRate(), this.getClass().getSimpleName());
	}
}