package Week1Lesson1;

/**
 * @author haftomtesfay
 *
 */
class Course {

	private String number;
	private String title;
	private int units;
	private Faculty faculty; //Association to Faculty class
	
	public Course(String number, String title, int units, Faculty faculty) {
		this.number = number;
		this.title = title;
		this.units = units;
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

	/**
	 * @return
	 */
	public Faculty getFaculty() {
		// TODO Auto-generated method stub
		return faculty;
	}

}