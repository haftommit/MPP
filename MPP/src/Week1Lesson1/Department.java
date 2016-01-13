/**
 * 
 */
package Week1Lesson1;

import java.util.ArrayList;

/**
 * @author haftomtesfay
 *
 */
class Department {
	private String deptName; // Department name
	private ArrayList<Person> personList; // Association (0...*)  - Department keeps a reference to list of Person class

	public Department(String name) { // Constructor
		this.deptName = name;
		this.personList = new ArrayList<Person>();
	}

	public String getDeptName() {
		return deptName;
	}

	public void getPersonList(){

		ArrayList<Person> plist = new ArrayList<Person>();
		System.out.println("List of Persons in the Dept"+deptName);
	}

	// shows the name, phone number, age and type (student, faculty or staff) of all members in the department.
	public void showAllMembers() {

		for (Person list : personList) {
			Class cls = list.getClass();
			System.out.println("Name: " + list.getName() + " Phone: " + list.getPhone() + " Age: " + list.getAge()
			+ " Type: " + cls.getSimpleName());
		}
	}	

	// computes the sum of all the salaries (per month) paid to faculty and staff.
	public double getTotalSalary() {

		double totalSalary = 0.0;
		for (Person list : personList) {
			if (list instanceof Faculty) {
				Faculty faculty = (Faculty) list;
				totalSalary += faculty.getSalary();
			} 
			else if (list instanceof Staff) {
				Staff st = (Staff) list;
				totalSalary += st.getSalary();
			}
		}
		return totalSalary;
	}
	//shows a list of all faculty names and the total number of units they teach.
	public void unitsPerFaculty() {
		for (Person list : personList) {
			if (list instanceof Faculty) {
				Faculty ff = (Faculty) list;
				System.out.println(ff.getName() + ": " + ff.getTotalUnits());
			}
		}
	}

	public void addPerson(Person per) {

		personList.add(per);

	}
}