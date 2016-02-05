/**
 * 
 */
package FunctionalProgrammingExample;

/**
 * @author haftomtesfay
 *
 */

import java.util.Comparator;

public class EmployeeComparatorSalary implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		if (emp1.getSalary() == emp2.getSalary())
			return 0;
		else if (emp1.getSalary() < emp2.getSalary())
			return -1;
		else
			return 1;
	}

}
