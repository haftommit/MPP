
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

	public Position(String title, String desc, Department dept) {
		this.title = title;
		this.description = desc;
		this.dept = dept;

		employeeList = new ArrayList<Employee>();
	}

	public String getTitle() {
		return title;
	}

	public void print() {

		System.out.println("Title: " + title + "Description: " + description);

		for (Employee emp : employeeList)
			emp.print();
	}
	

	public void addEmployee(Employee emp){
		employeeList.add(emp);
	}
	
}
