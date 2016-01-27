package schoolLabApplication;

/**
 * @author haftomtesfay
 *
 */

public class Person{
	protected String name;
	protected String phone;
	protected int age;

	public Person(String name, String phone, int age) {
		this.name = name;
		this.phone = phone;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}

	public int getAge() {
		return age;
	}

}