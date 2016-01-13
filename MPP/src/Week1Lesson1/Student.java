/**
 * 
 */
package Week1Lesson1;

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

	double GPA;
	private ArrayList<Course> courseList;

	public Student(String name, String phone, int age, double GPA) {
		super(name, phone, age);
		this.GPA = GPA;
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
		for (Course courses : courseList) {
			totalUnits += courses.getUnits();
		}
		return totalUnits;
	}

	public void addCourse(Course course) {
		courseList.add(course);
	}

}
