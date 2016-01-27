package payrollcalculationapplication;

/**
 * @author haftomtesfay
 *
 */

/** Immutable */
final public class PayCheck {
	
	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;
	private DateRange payPeriod;
	private Employee employeeId;
	
	public PayCheck(double grossPay, double fica, double state, double local, double medicare, double ssn,
			DateRange range) {

		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = ssn;
		this.payPeriod = range;
	}
	
	public void print() {
		
		System.out.println("GrossPay: " + grossPay);
		System.out.println("Fica: " + fica);
		System.out.println("State: " + state);
		System.out.println("Local: " + local);
		System.out.println("MediCare: " + medicare);
		System.out.println("Social Security: " + socialSecurity);
		System.out.println("PayPeriod range: " + payPeriod);
		//System.out.println(toString());
	}
	public void setEmployee(Employee emp) {
		this.employeeId = emp;
	}
	
//	@Override
//	public String toString() {
//		return "Paystub: \n "
//				+ "  Gross Pay: " + grossPay + "\n"
//				+ "  Fica: " + fica  + "\n" 
//				+ "  State: " + state  + "\n" 
//				+ "  Local: " + local  + "\n" 
//				+ "  Medicare: " + medicare  + "\n" 
//				+ "  Social Security: " + socialSecurity  + "\n" 
//				+ "  NET PAY: " + getNetPay();
//	}
	public double getNetPay() {
		return grossPay - grossPay * fica
				        - grossPay * state
				        - grossPay * local
				        - grossPay * medicare
				        - grossPay * socialSecurity;
	}
}