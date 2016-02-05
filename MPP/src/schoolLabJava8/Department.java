/**
 * 
 */
package schoolLabJava8;

/**
 * @author haftomtesfay
 *
 */
import java.util.ArrayList;
import java.util.function.Function;

public class Department {

	private String name;
	private ArrayList<Person> members;

	public Department(String name) {
		this.name = name;
		members = new ArrayList<Person>();
	}

	public double getTotalSalary() {

		double facultySalary = members.stream().filter(e -> e instanceof Faculty).map((Function<Person, Faculty>) e -> {
			return (Faculty) e;
		}).mapToDouble(e -> e.getSalary()).sum();

		double staffSalary = members.stream().filter(e -> e instanceof Staff).map((Function<Person, Staff>) e -> {
			return (Staff) e;
		}).mapToDouble(e -> e.getSalary()).sum();

		return facultySalary + staffSalary;
	}

	public void showAllMembers() {

		members.forEach(e -> System.out.println("Name: " + e.getName() + "\t Phone:" + e.getPhone() + "\tAge: "
				+ e.getAge() + "\tType:" + e.getClass().getSimpleName()));

	}

	public void unitsPerFaculty() {

		members.forEach(per -> {
			if (per instanceof Faculty) {
				Faculty faculty = (Faculty) per;
				System.out.println(faculty.getName() + "\t" + faculty.getTotalUnits());
			}
		});
	}

	public void addPerson(Person per) {

		members.add(per);
	}

	public void displayStudentPerFaulty(Faculty fct) {
		System.out.println("Faculty Name: " + fct.getName());
		ArrayList<Course> courseList;
		Faculty faculty;
		for (Person per : members) {
			// System.out.println("Inside Person");
			if (per instanceof Student) {
				// System.out.println("Inside Student");
				Student std = (Student) per;
				courseList = std.getCourses();
				for (Course course : courseList) {
					// System.out.println("Inside Course");
					faculty = course.getFaculty();
					if (fct.getName().equals(faculty.getName())) {
						System.out.println("Student Name: " + std.getName());

					}
				}
			}
		}			

	}

}