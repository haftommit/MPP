package schoollab_LamdaExpression;

import java.util.ArrayList;

/**
 * @author haftomtesfay
 *
 */
class Department {
	private String name; // Department name
	private ArrayList<Person> persons; // Association (0...*)  - Department keeps a reference to list of Person class

	public Department(String dname) { // Constructor
		this.name = dname;
		this.persons = new ArrayList<Person>();
	}

	public String getDeptName() {
		return name;
	}
	public double getTotalSalary() {

		double facultySalary = persons.stream().filter(e -> e instanceof Faculty).map((Function<Person, Faculty>) e -> {
			return (Faculty) e;
		}).mapToDouble(e -> e.getSalary()).sum();

		double staffSalary = persons.stream().filter(e -> e instanceof Staff).map((Function<Person, Staff>) e -> {
			return (Staff) e;
		}).mapToDouble(e -> e.getSalary()).sum();

		return facultySalary + staffSalary;
	}

	public void showAllMembers() {

		persons.forEach(e -> System.out.println("Name: " + e.getName() + "\t Phone:" + e.getPhone() + "\tAge: "
				+ e.getAge() + "\tType:" + e.getClass().getSimpleName()));

	}
	//shows a list of all faculty names and the total number of units they teach.
	public void unitsPerFaculty() {
		for (Person p : persons) {
			if (p instanceof Faculty) {
				Faculty f = (Faculty) p;
				System.out.println(f.getName() + ": " + f.getTotalUnits());
			}
		}
	}
	public void addPerson(Person p) {

		persons.add(p);

	}
	public void displayStudentPerFaulty(Faculty fct) {
		System.out.println("Faculty name: " + fct.getName());
		ArrayList<Course> courseList;
		Faculty faculty;
		for (Person p : persons) {
			//System.out.println("Inside Person");
			if (p instanceof Student) {
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

