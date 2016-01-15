package week1Lesson2;
import java.sql.Date;

/**
 * @author haftomtesfay
 *
 */

public class Employee {

	private String employeeId;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private Date dateOfBirth;
	private String SSN;
	private double salary;

	private Position positionHeld;

	public Employee(String empId, String firstName, String middleName, String lastName, String SSN, double salary,
			Position posHeld) {

		this.employeeId = empId;
		this.firstName = firstName;
		this.middleInitial = middleName;
		this.lastName = lastName;
		this.SSN = SSN;
		this.salary = salary;
		this.positionHeld = posHeld;
	}

	public Date setDateOfBirth() {
		return dateOfBirth;
	}

	public void print() {

		System.out.println("Id: " + employeeId + " Name: " + firstName + " " + middleInitial + " " + lastName + " SSN: "
				+ SSN + " Date of birth: " + dateOfBirth + " Salary: " + salary);
	}

}