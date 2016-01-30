/**
 * 
 */
package orderTrackingApplication;

/**
 * @author haftomtesfay
 *
 */

public class Product implements IProduct {

	private String description;
	private String productNumber;
	private double price;

	public Product(String desc, String proNumber, double price) {

		this.description = desc;
		this.productNumber = proNumber;
		this.price = price;

	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

}
