/**
 * 
 */
package payrollcalculationapplication;

/**
 * @author haftomtesfay
 *
 */

public class Salaried extends Employee {

	double salary;

	public Salaried(String id, /* PayCheck check, */ double salary) {
		super(id);
		// TODO Auto-generated constructor stub
		this.salary = salary;
	}

	@Override
	public double calcGrosspay() {
		// TODO Auto-generated method stub
		return salary;
	}

}
