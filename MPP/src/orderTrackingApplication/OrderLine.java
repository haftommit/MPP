/**
 * 
 */
package orderTrackingApplication;

/**
 * @author haftomtesfay
 *
 */
import java.util.Date;

public class OrderLine implements IProduct{

	private Order order;
	private int quantity;
	private double price;
	private String status;
	private Date shipDate;
	private double points;

	public OrderLine(Order order, int quantity, double price, String status, Date shipDate, double points) {
		
		this.order = order;
		this.quantity = quantity;
		this.price = price;
		this.status = status;
		this.shipDate = shipDate;
		this.points = points;
	}

	public double computePrice() {

		return quantity * price;
	}

	public double computePoints() {

		return quantity * points;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

}
