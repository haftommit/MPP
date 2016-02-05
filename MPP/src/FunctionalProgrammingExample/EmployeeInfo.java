 package FunctionalProgrammingExample;

/**
 * @author haftomtesfay
 *
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class EmployeeInfo {

	static enum SortMethod {
		BYNAME, BYSALARY
	};

	SortMethod sorting;

	public EmployeeInfo() {

	}

	public EmployeeInfo(SortMethod sorting) {
		this.sorting = sorting;
	}

	public void sort(List<Employee> emps) {

		if (sorting == SortMethod.BYNAME) {
			Collections.sort(emps, new EmployeeNameComparator());
		} else if (sorting == SortMethod.BYSALARY) {
			Collections.sort(emps, new EmployeeComparatorSalary());
		}
	}

	public void sort(List<Employee> emps, final SortMethod sorting) {
		class EmployeeComparator implements Comparator<Employee> {

			@Override
			public int compare(Employee emp1, Employee emp2) {
				// TODO Auto-generated method stub
				if (sorting == SortMethod.BYNAME) {
					return emp1.getName().compareTo(emp2.getName());
				} else if (sorting == SortMethod.BYSALARY) {
					if (emp1.getSalary() == emp2.getSalary())
						return 0;
					else if (emp1.getSalary() < emp2.getSalary())
						return -1;
					else
						return 1;

				}
				return 0;

			}

		}
		Collections.sort(emps, new EmployeeComparator());

	}

	public static List<String> findStartWithChar(List<String> lists, char c) {
		List<String> startsWith = new ArrayList<>();

		for (String lst : lists) {
			String str = "" + c;
			if (lst.startsWith(str)) {
				startsWith.add(lst);
			}
		}

		return startsWith;
	}

	public static List<String> findStartWithChar(List<String> lst, String letter) {

		// using sream
		/*
		 * return lst.stream().filter(name -> name.startsWith(letter)).map(name
		 * -> name.toUpperCase()) .collect(Collectors.toList());
		 */

		// using parallel stream

		return lst.parallelStream().filter(name -> name.startsWith(letter)).map(name -> name.toUpperCase())
				.collect(Collectors.toList());

	}

	public static void main(String[] args) {

		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 60000));

		EmployeeInfo empinfo = new EmployeeInfo(EmployeeInfo.SortMethod.BYNAME);

		System.out.println("Employee ordered by Name:");
		empinfo.sort(emps);
		System.out.println(emps);

		System.out.println("Employee ordered by Salary:");
		empinfo = new EmployeeInfo(EmployeeInfo.SortMethod.BYSALARY);
		empinfo.sort(emps);
		System.out.println(emps);

		System.out.println("Sorting using inner classes by name!");
		empinfo = new EmployeeInfo();
		empinfo.sort(emps, SortMethod.BYNAME);
		System.out.println(emps);

		System.out.println("Sorting using inner classes by salary!");
		empinfo = new EmployeeInfo();
		empinfo.sort(emps, SortMethod.BYSALARY);
		System.out.println(emps);

		Consumer<Employee> emp = new Consumer() {

			@Override
			public void accept(Object emps) {
				// TODO Auto-generated method stub
				System.out.println((Employee) emps);
			}
		};

		System.out.println("==using consumer and foreach method==");
		emps.forEach(emp);

		BiFunction<Integer, Integer, Integer> ff = (x, y) -> 2 * x - y;
		System.out.println("Bifunction: " + ff.apply(4, 5));

		TriFunction<Integer, Integer, Integer, Integer> tri = (x, y, z) -> x + y + z;
		System.out.println("User defined: " + tri.apply(3, 4, 6));

		List<String> lst = new ArrayList<>();
		lst.add("china");
		lst.add("Haftom");
		lst.add("Kebari");
		System.out.println(empinfo.findStartWithChar(lst, 'c'));
	}
}