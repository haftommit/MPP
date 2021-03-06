package schoolLabApplication;

/**
 * @author haftomtesfay
 *
 */
class Course {

	private String number;
	private String title;
	private int units;
	private Faculty faculty; //A Course is taught by a Faculty --> (Association)
	
	public Course(String number, String title, int units, Faculty faculty) {
		this.number = number;
		this.title = title;
		this.units = units;
		this.faculty = faculty;
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