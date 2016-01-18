package week1Lesson2;
import java.util.ArrayList;

/**
 * @author haftomtesfay
 *
 */

import java.util.ArrayList;
public class Company {

	private String name;
	private ArrayList<Department> departmentList;

	public Company(String name) {

		this.name = name;
		departmentList = new ArrayList<Department>();
	}

	public void print() {
		System.out.println(
				"Company Name: " + name /* + " Total Salary: $" + getSalary() */);
		for (Department dept : departmentList)
			dept.print();

	}

	public void addDepartment(Department dept) {
		departmentList.add(dept);
	}

	public double getSalary() {
		double totalSalary = 0;
		for (Department dept : departmentList)
			totalSalary += dept.getSalary();
		return totalSalary;
	}

	public void printReportingHeighrarchy() {

		for (Department dept : departmentList) {
			dept.printReportingHeighrarchy();
		}
	}

	public Position getTopExecutive() {

		Position pos = null;

		for (Department dept : departmentList) {
			
		}
		return pos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}