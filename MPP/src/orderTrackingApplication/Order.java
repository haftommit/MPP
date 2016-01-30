/**
 * 
 */
package orderTrackingApplication;

/**
 * @author haftomtesfay
 *
 */
import java.util.ArrayList;
import java.util.Date;

public class Order {
	private String orderNumber;
	private boolean prePaid;
	private double orderPrice;
	private Date orderDate;
	private String status;

	ArrayList<OrderLine> orders;

	public Order(String orderNumber, boolean prePaid, double orderPrice, Date orderDate, String status) {

		this.orderNumber = orderNumber;
		this.prePaid = prePaid;
		this.orderPrice = orderPrice;
		this.orderDate = orderDate;
		this.status = status;

		orders = new ArrayList<OrderLine>();
	}

	public double getTotalPrice() {

		double totalPrice = 0;

		for (OrderLine ord : orders) {
			totalPrice += ord.computePrice();
		}

		return totalPrice;
	}

	public boolean getPrePaid() {

		return prePaid;
	}

	public double getCustomerPoints() {
		double totalPoint = 0;
		for (OrderLine ord : orders) {
			totalPoint += ord.computePoints();
		}
		return totalPoint;
	}

	public double getOrderPoints() {

		return 0;
	}

	public void setCustomerPoints(double pt) {
		
		

	}

}