/**
 * 
 */
package orderTrackingApplication;

/**
 * @author haftomtesfay
 *
 */
public class CorporateCustomer extends Acustomer {

	private String creditRating;
	private double creditLimit;

	CorporateCustomer(String name, String address, String phone, double point, String creditRating,
			double creditLimit) {
		super(name, address, phone, point);
		// TODO Auto-generated constructor stub
		this.creditRating = creditRating;
		this.creditLimit = creditLimit;
	}

	@Override
	public String getCreditRating() {
		// TODO Auto-generated method stub
		return creditRating;
	}

	public double generateMonthlyBill() {

		return 0;
	}

	
	@Override
	public String getCretitRating() {
		// TODO Auto-generated method stub
		return creditRating;
	}

}