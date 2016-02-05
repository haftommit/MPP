/**
 * 
 */
package schoolLabJava8;

/**
 * @author haftomtesfay
 *
 */
public class Course {

	private String number;
	private String title;
	private int units;
	Faculty faculty;

	public Course(String number, String title, int units, Faculty member) {

		this.number = number;
		this.title = title;
		this.units = units;
		this.faculty = member;
	}

	public String getNumber() {
		return number;
	}

	public String getTitle() {
		return title;
	}

	public int getUnits() {
		return units;
	}

	public Faculty getFaculty() {
		return faculty;
	}
}