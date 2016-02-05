/**
 * 
 */
package schoolLabJava8;

import java.util.ArrayList;

/**
 * @author haftomtesfay
 *
 */
public class Faculty extends Person {

	private double salary;
	private ArrayList<Course> courseList;

	public Faculty(String name, String phone, int age, double salary) {
		super(name, phone, age);
		this.salary = salary;
		courseList = new ArrayList<Course>();
	}

	public double getSalary() {
		return salary;
	}

	public int getTotalUnits() {

		return courseList.stream().mapToInt(c -> c.getUnits()).sum();

	}

	public void addCourse(Course course) {

		courseList.add(course);
	}

	public void displayFacultyStudents() {

		System.out.println("Name of faculty: " + getName());

	}

	@Override
	public String toString() {

		return name + "\t" + phone + "\t" + age + "\t" + salary;
	}
}