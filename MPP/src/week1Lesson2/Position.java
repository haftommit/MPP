
package week1Lesson2;
import java.util.ArrayList;

/**
 * @author haftomtesfay
 *
 */

public class Position {

	private String title;
	private String description;
	private Department dept;
	private ArrayList<Employee> employeeList;

	private Position superior;
	private ArrayList<Position> inferior;

	public Position(String title, String desc, Department dept) {
		this.title = title;
		this.description = desc;
		this.dept = dept;

		this.employeeList = new ArrayList<Employee>();
		this.inferior = new ArrayList<Position>();
	}

	public String getTitle() {
		return title;
	}

	public void print() {

		System.out.println("Title: " + title + " Description: "
				+ description );	/* + " Total Salary: $" + getSalary() */

		for (Employee emp : employeeList)
			emp.print();
	}

	public void addEmployee(Employee emp) {
		employeeList.add(emp);
	}

	public Department getDepartment() {

		return dept;
	}

	public double getSalary() {
		// TODO Auto-generated method stub
		double totalSalary = 0;
		for (Employee emp : employeeList)
			totalSalary += emp.getSalary();
		return totalSalary;
	}

	public void addInferior(Position infer) {

		inferior.add(infer);
	}

	public void setSuperior(Position superior) {
		this.superior = superior;
	}

	public Position getSuperior() {
		return superior;
	}

	/*
	 * public boolean isManager(Employee emp) { Position pos = emp.getPostion();
	 * if (pos.equals(superior)) return true; else return false;
	 * 
	 * 
	 */
	public void printDownLine() {

		for (Position pos : inferior) {
			System.out.println("  Title: " + pos.title + " Description: " + pos.description);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + ((superior == null) ? 0 : superior.hashCode());
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
		Position other = (Position) obj;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (superior == null) {
			if (other.superior != null)
				return false;
		} else if (!superior.equals(other.superior))
			return false;
		return true;
	}
	

}