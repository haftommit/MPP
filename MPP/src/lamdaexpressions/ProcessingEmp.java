/**
 * 
 */
package lamdaexpressions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author haftomtesfay
 *
 */
// AN Exercise on stream and lambda expression
public class ProcessingEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee[] employees = { new Employee("Jason", "Red", 5000, "IT"), new Employee("Ashley", "Green", 7600, "IT"),
				new Employee("Matthew", "Indigo", 3587.5, "Sales"),
				new Employee("James", "Indigo", 4700.77, "Marketing"), new Employee("Luke", "Indigo", 6200, "IT"),
				new Employee("Jason", "Blue", 3200, "Sales"), new Employee("Wendy", "Brown", 4236.4, "Marketing"),
				new Employee("Berhe", "Yellow", 4300, "Marketing"),
				new Employee("Belete", "Yellow", 4300, "Marketing") };

		// get List view of the Employees
		List<Employee> list = Arrays.asList(employees);

		// display all Employees
		System.out.println("Complete Employee list:");
		list.stream().forEach(System.out::println);

		System.out.println("==============================A==============================");
		// 1) 
		System.out.println("Number of Employees whose last name starts with letter B: "
				+ list.stream().filter(e -> e.getLastName().startsWith("B")).count());

		// 2)
		System.out.println("The list of employees whose last name starts with letter B in sorted order: ");
		
		Function<Employee, String> empLastName = Employee::getLastName;
		
		//Function<Employee, String> byFirstName = Employee::getFirstName;
		Comparator<Employee> empNameComparator = Comparator.comparing(empLastName);
		list.stream().filter(e -> e.getLastName().startsWith("B")).sorted(empNameComparator)
				.forEach(System.out::println);
		// 3)
		System.out.println(
				"The list of employees whose last name starts with letter B and change the last name and first name to upper case");
		list.stream().filter(e -> e.getLastName().startsWith("B")).map(e -> new Employee(e.getFirstName().toUpperCase(),
				e.getFirstName().toUpperCase(), e.getSalary(), e.getDepartment())).forEach(System.out::println);

		// 4
		System.out.println(
				"The list of all employees but if the last name starts with B then capitalize it using Stream");

		Stream<Employee> empWithB = list.stream().filter(e -> e.getLastName().startsWith("B")).map(
				e -> new Employee(e.getFirstName(), e.getLastName().toUpperCase(), e.getSalary(), e.getDepartment()));
		Stream<Employee> empWithoutB = list.stream().filter(e -> !e.getLastName().startsWith("B"))
				.map(e -> new Employee(e.getFirstName(), e.getLastName(), e.getSalary(), e.getDepartment()));
		Stream<Employee> empStream = Stream.concat(empWithB, empWithoutB);
		empStream.forEach(System.out::println);
		System.out
				.println("The list of all employees but if the last name starts with B then capitalize it using List");

		List<Employee> empWithBList = list.stream().filter(e -> e.getLastName().startsWith("B")).map(
				e -> new Employee(e.getFirstName(), e.getLastName().toUpperCase(), e.getSalary(), e.getDepartment()))
				.collect(Collectors.toList());
		List<Employee> empWithoutBList = list.stream().filter(e -> !e.getLastName().startsWith("B"))
				.map(e -> new Employee(e.getFirstName(), e.getLastName(), e.getSalary(), e.getDepartment()))
				.collect(Collectors.toList());
		List<Employee> empAllList = empWithBList;
		empAllList.addAll(empWithoutBList);

		empAllList.stream().forEach(System.out::println);

		// 5
		System.out.println("Distinct list of employee who start with I: ");
		list.stream().filter(e -> e.getLastName().startsWith("I")).sorted(empNameComparator).distinct()
				.forEach(System.out::println);

		// 6

		System.out.println("The avarage salary: " + list.stream().mapToDouble(e -> e.getSalary()).average());

		// 7

		System.out.println("The sum of the salary using reduce using identity and binary operation: "
				+ list.stream().map(e -> e.getSalary()).reduce((double) 0, (a, b) -> a + b));

		System.out.println("The sum of the salary using reduce using binary operation only: "
				+ list.stream().map(e -> e.getSalary()).reduce((a, b) -> a + b));

		// 8

		System.out.println("Only the frist name of the employees: ");
		list.stream().map(e -> e.getFirstName()).forEach(System.out::println);

		// 9

		System.out.println("Use reduce to find the salary then print the stotal salary");
		double totalSalary = list.stream().map(e -> e.getSalary()).reduce((double) 0, (a, b) -> a + b);
		System.out.println(totalSalary);

		// 10

		System.out.println("creatin infinite stream and print only the first 20: ");
		Stream<Integer> multipleOfTwo = Stream.iterate(0, n -> n + 2).limit(20);
		multipleOfTwo.forEach(System.out::print);

	}

}