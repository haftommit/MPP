package week1Lesson2;

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
		System.out.println("Name: " + name);
		for (Department dept : departmentList)
			dept.print();

	}
	
	public void addDepartment(Department dept){
		departmentList.add(dept);
	}
}
