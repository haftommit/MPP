package Week1Lesson1;

import java.util.ArrayList;

/**
 * @author haftomtesfay
 *
 */
class Department {
	private String name; // Department name
	private ArrayList<Person> personList; // Association (0...*)  - Department keeps a reference to list of Person class

	public Department(String dname) { // Constructor
		this.name = dname;
		this.personList = new ArrayList<Person>();
	}

	public String getDeptName() {
		return name;
	}
	// shows the name, phone number, age and type (student, faculty or staff) of all members in the department.
	public void showAllMembers() {

		for (Person list : personList) {
			Class cls = list.getClass();//Return Full Qualified class name @packagename.classname.hashcode
			System.out.println("Name: " + list.getName() + " Phone: " + list.getPhone() + " Age: " + list.getAge()
			+ " Type: " + cls.getSimpleName());
		}
	}	

	// computes the sum of all the salaries (per month) paid to faculty and staff.
	public double getTotalSalary() {

		double totalSalary = 0.0;
		for (Person p : personList) {
			if (p instanceof Faculty) {
				Faculty faculty = (Faculty) p;
				totalSalary += faculty.getSalary();
			} 
			else if (p instanceof Staff) {
				Staff st = (Staff) p;
				totalSalary += st.getSalary();
			}
		}
		return totalSalary;
	}
	//shows a list of all faculty names and the total number of units they teach.
	public void unitsPerFaculty() {
		for (Person p : personList) {
			if (p instanceof Faculty) {
				Faculty f = (Faculty) p;
				System.out.println(f.getName() + ": " + f.getTotalUnits());
			}
		}
	}
	public void addPerson(Person p) {

		personList.add(p);

	}
	public void displayStudentPerFaulty(Faculty fct) {
		System.out.println("Faculty name: " + fct.getName());
		ArrayList<Course> courseList;
		Faculty faculty;
		for (Person p : personList) {
			//System.out.println("Inside Person");
			if (p instanceof Student) {
				//System.out.println("Inside Student");
				Student std = (Student) p;
				courseList = std.getCourses();
				for (Course course : courseList) {
					//System.out.println("Inside Course");
					faculty = course.getFaculty();
					if(fct.getName().equals(faculty.getName())){
						System.out.println("Student Name: " + std.getName());

					}
				}
			}
		}
	}
}