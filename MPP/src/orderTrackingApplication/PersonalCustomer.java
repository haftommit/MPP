/**
 * 
 */
package orderTrackingApplication;

/**
 * @author haftomtesfay
 *
 */
public class PersonalCustomer extends Acustomer {

	private String creditRating;
	private String creditNumber;

	PersonalCustomer(String name, String address, String phone, double point, String creditRating,
			String creditNumber) {
		super(name, address, phone, point);
		// TODO Auto-generated constructor stub
		this.creditRating = creditRating;
		this.creditNumber = creditNumber;
	}

	@Override
	public String getCretitRating() {
		// TODO Auto-generated method stub
		return creditRating;
	}

	
	@Override
	public String getCreditRating() {
		// TODO Auto-generated method stub
		return creditRating;
	}

}
