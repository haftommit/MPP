package payrollcalculationapplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * @author haftomtesfay
 *
 */
public abstract class Employee {

	private String empId;

	private PayCheck payCheck;

	public Employee(String id) {

		this.empId = id;
	}

	public void print() {

		System.out.println("Id: " + empId);
	}

	public PayCheck calcCompensation(int month, int year) {

		double grossPay = calcGrosspay();
		double fica = (grossPay * 23) / 100;
		double state = (grossPay * 5) / 100;
		double local = (grossPay * 1) / 100;
		double mediCare = (grossPay * 3) / 100;
		double social = (grossPay * 7.5) / 100;
		Calendar startDate = Calendar.getInstance();
		startDate.set(2016, 1, 1);
		Calendar endDate = Calendar.getInstance();
		endDate.set(2016, 1, 31);

		return new PayCheck(grossPay, fica, state, local, mediCare, social, new DateRange(startDate, endDate));
	}

	public void setPayCheck(PayCheck check) {
		this.payCheck = check;
	}

	public abstract double calcGrosspay();

}


