/**
 * 
 */
package Week1Lesson1;

/**
 * @author haftomtesfay
 *
 */
class Staff extends Person{

	private double staffSalary;

	public Staff(String name, String phone, int age, double salary) {
		super(name, phone, age);
		this.staffSalary = salary;
	}

	public double getSalary() {
		return staffSalary;
	}
}

