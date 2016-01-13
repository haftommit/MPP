package Week1Lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.util.ArrayList;


/**
 * @author haftomtesfay
 *
 */
class Department {
	private String deptName; // Department name
	private ArrayList<Person> personList; // Association (0...*)  - Department keeps a reference to list of Person class

	public Department(String name, Person person) { // Constructor
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
	
	public void showAllMembers(){// shows the name, phone number, age and type (student, faculty or staff) of all members in the department.
		
		
	}

	public void unitsPerFaculty(){// shows a list of all faculty names and the total number of units they teach.

		System.out.println("3");
	}
	
	public double getTotalSalary(){// computes the sum of all the salaries (per month) paid to faculty and staff.

		
	}
}
class Person{
	protected String personName;
	protected String phone;
	protected int age;

	public Person(String name, String phone, int age) {
		this.personName = name;
		this.phone = phone;
		this.age = age;
	}
	public String getName() {
		return personName;
	}
	public String getPhone() {
		return phone;
	}

	public int getAge() {
		return age;
	}

}
class Faculty extends Person{

	private double salary;
	ArrayList<Course> facultyList = new ArrayList<Course>();

	public Faculty(String name, String phone, int age, double salary) {
		super(name,phone, age);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void getTotalUnits(){

	}
}
class Student extends Person{

	private double GPA;
	ArrayList<Course> courseList = new ArrayList<Course>();
	
	public Student(String name, String phone, int age) {
		super(name, phone, age);
		// TODO Auto-generated constructor stub
	}
	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public void getTotalUnits(){

	}
}
class Staff extends Person{

	private double staffSalary;
	
	public Staff(double salary) {
		super();
		this.staffSalary = salary;
	}

	public double getSalary() {
		return staffSalary;
	}
}
class Course {

	private String number;
	private String title;
	private int units;
	private Faculty faculty;
	
	
	public Course(String number, String title, int units) {
		super();
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

}
class Staffstudents extends Student{
	private double salary;
	private Date datastarted;
	private Staff staff;
	
	
	public Staffstudents(double salary, Date datestarted, Staff staff) {
		this.datastarted = datestarted;
		this.salary = salary;
		this.salary = salary;
	}
}

public class DepartmentApplication
{
	public static void main(String[] args) throws IOException
	{
		Department dept = new Department("ComputerScience", new Person("Haftom", "123", 25));
		
		// Create faculty objects
		Faculty frankMoore = new Faculty("Frank Moore","472-5921",43,10000);	
		Faculty samHoward = new Faculty("Sam Howard","472-7222",55,9500);
		Faculty johnDoodle = new Faculty("John Doodle","472-6190",39,8600);
		dept.addFaculty(frankMoore);
		dept.addFaculty(samHoward);
		dept.addFaculty(johnDoodle);


		// Create student objects
		Student johnDoe = new Student("John Doe","472-1121",22,4.0);
		Student maryJones = new Student("Mary Jones","472-7322",32,3.80);
		Student leeJohnson = new Student("Lee Johnson","472-6009",19,3.65);
		dept.addStudent(johnDoe);
		dept.addStudent(maryJones);
		dept.addStudent(leeJohnson);

		// Create staff objects
		Staff frankGore = new Staff("Frank Gore","472-3321",33,4050);
		Staff adamDavis = new Staff("Adam Davis","472-7552",50,5500);
		Staff davidHeck = new Staff("David Heck","472-8890",29,3600);
		dept.addStaff(frankGore);
		dept.addStaff(adamDavis);
		dept.addStaff(davidHeck);

		// Create course objects	
		Course cs201 = new Course("cs201","programming",4, johnDoodle);
		Course cs360 = new Course("cs360","database",3, samHoward);
		Course cs404 = new Course("cs404","compiler",4, johnDoodle);
		Course cs240 = new Course("cs240","datastructure",2, johnDoodle);
		Course cs301 = new Course("cs301","Software engg",3, samHoward);
		Course cs450 = new Course("cs450","Advanced architecture",5,frankMoore);


		double totsalary = 0;

		while(true)
		{
			putText("Enter first letter of ");
			putText("getTotalSalary, showAllMembers, unitsPerFaculty or quit : ");
			int choice = getChar();
			switch(choice)
			{
			case 'g':
				totsalary=dept.getTotalSalary();
				putText("Total sum of all salaries is:");
				putText(String.valueOf(totsalary)+"\n");              
				break;
			case 's':
				dept.showAllMembers();
				break;
			case 'u':
				dept.unitsPerFaculty();
				break;
			case 'q': return;
			default:
				putText("Invalid entry\n");
			}  // end switch
		}  // end while
	}  // end main()
	//-------------------------------------------------------------
	public static void putText(String s) //writes string s to the screen
	{
		System.out.println(s);
	}
	//-------------------------------------------------------------
	public static String getString() throws IOException  //reads a string from the keyboard input
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	//-------------------------------------------------------------
	public static char getChar() throws IOException //reads a character from the keyboard input
	{
		String s = getString();
		return s.charAt(0);
	}

	//-------------------------------------------------------------
	public static int getInt() throws IOException // reads an integers from the keyboard input
	{
		String s = getString();
		return Integer.parseInt(s);
	}

}  // end class 