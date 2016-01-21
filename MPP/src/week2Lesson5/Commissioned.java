/**
 * 
 */
package week2Lesson5;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author haftomtesfay
 *
 */
public class Commissioned extends Employee {

	private double commission;
	private double baseSalary;

	private ArrayList<Order> orders;

	public Commissioned(String empid, double commission, double baseSalary, ArrayList<Order> orders) {
		super(empid);
		this.commission = commission;
		this.baseSalary = baseSalary;
	}
	public void addOrder(Order order) {

		orders.add(order);
	}
	private double calcCommission() {
		double totalCommission = 0;
		for (Order o : orders) {
			totalCommission += commission * o.getOrderAmount();
		}

		return baseSalary + totalCommission;
	}

	@Override
	public double calcGrosspay() {
		// TODO Auto-generated method stub
		return calcCommission();
	}
}

