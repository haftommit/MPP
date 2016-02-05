 package FunctionalProgrammingExample;

import java.util.Comparator;

/**
 * @author haftomtesfay
 *
 */
import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub

		return emp1.getName().compareTo(emp2.getName());
	}
}