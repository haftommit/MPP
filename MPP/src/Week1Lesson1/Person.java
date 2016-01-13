/**
 * 
 */
package Week1Lesson1;

/**
 * @author haftomtesfay
 *
 */

public class Person{
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