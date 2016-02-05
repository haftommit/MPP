/**
 * 
 */
package schoolLabJava8;

/**
 * @author haftomtesfay
 *
 */
import java.util.ArrayList;
import java.util.Date;

public class StaffStudet extends Staff {

	private Student student;
	private Date startDateFirstCourse;

	public StaffStudet(String name, String phone, int age, double salary, Student std) {
		super(name, phone, age, salary);
		this.student = std;
	}

	public double getGPA() {
		return student.getGPA();
	}

	public ArrayList<Course> getCourses() {
		return student.getCourses();
	}

	public int getTotalUnits() {

		return student.getTotalUnits();
	}

	public void addCourse(Course course) {
		student.addCourse(course);
	}

	public void setStartFirstCourse(Date start) {
		this.startDateFirstCourse = start;
	}

	public Date getStartDate() {
		return startDateFirstCourse;
	}
}
