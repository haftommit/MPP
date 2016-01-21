package week2Lesson5;

import java.time.LocalDate;
import java.util.Calendar;

/**
 * @author haftomtesfay
 *
 */

public class Order {

	private Commissioned commEmployee;
	private String orderNumber;
	private Calendar orderDate;
	private double orderAmount;

	public Order(String orderNumber, Calendar orderDate, double orderAmount) {

		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}

	public double getOrderAmount() {

		return this.orderAmount;
	}

	public void setCommissionedEmployee(Commissioned comEmp) {

		this.commEmployee = comEmp;
	}

}