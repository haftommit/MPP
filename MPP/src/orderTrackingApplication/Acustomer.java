/**
 * 
 */
package orderTrackingApplication;

/**
 * @author haftomtesfay
 *
 */
import java.util.ArrayList;

public abstract class Acustomer implements ICustomer {

	private String name;
	private String address;
	private String phone;
	private double points;
	ArrayList<Order> orders;

	Acustomer(String name, String address, String phone, double point) {

		this.name = name;
		this.address = address;
		this.phone = phone;
		this.points = point;
		orders = new ArrayList<Order>();
	}

	abstract public String getCreditRating();

}
