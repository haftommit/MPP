/**
 * 
 */
package schoolLabApplication;

/**
 * @author haftomtesfay
 *
 */
/**
 * @author haftomtesfay
 *
 */
import java.util.ArrayList;

public class Student extends Person {

	private double GPA;
	private ArrayList<Course> courseList;

	public Student(String name, String phone, int age, double gpa) {
		super(name, phone, age);
		this.GPA = gpa;
		courseList = new ArrayList<Course>();
	}

	public double getGPA() {
		return GPA;
	}

	public ArrayList<Course> getCourses() {
		return courseList;
	}

	public int getTotalUnits() {

		int totalUnits = 0;
		for (Course c : courseList) {
			totalUnits += c.getUnits();
		}
		return totalUnits;
	}

	public void addCourse(Course c) {
		courseList.add(c);
	}

}
