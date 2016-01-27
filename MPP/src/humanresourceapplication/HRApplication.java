package humanresourceapplication;

import java.text.NumberFormat;

/**
 * @author haftomtesfay
 *
 */
public class HRApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company comp = new Company("Haftom");
		Department hrDept = new Department("HR", "Mekelle", comp);

		Position snrSec = new Position("HR", "Main HR", hrDept);
		Employee emp1 = new Employee("001", "Gere", "Tsegay", "Tilahun", "001", 3200, snrSec);
		snrSec.addEmployee(emp1);
		hrDept.addPosition(snrSec);

		Position sec = new Position("HR", "Main HR", hrDept);
		Employee emp2 = new Employee("002", "Gemechu", "Gadisa", "Tilahun", "002", 3200, sec);

		sec.addEmployee(emp2);
		hrDept.addPosition(sec);

		Position helpDesk = new Position("Help Desk", "helping", hrDept);
		Employee emp5 = new Employee("005", "Salem", "Mehammod", "Ali", "005", 2500, helpDesk);

		helpDesk.addEmployee(emp5);
		hrDept.addPosition(helpDesk);

		comp.addDepartment(hrDept);

		Department itDept = new Department("IT", "Addis Ababa", comp);

		Position snrDev = new Position("Senoir", "Senior Developer", itDept);
		Employee emp3 = new Employee("003", "Gosh", "Jhon", "Samuel", "003", 5200, snrDev);

		snrDev.addEmployee(emp3);
		itDept.addPosition(snrDev);

		Position junDev = new Position("Junier", "Junier Developer", itDept);
		Employee emp4 = new Employee("004", "Tamirat", "Sahile", "Tilahun", "004", 6200, junDev);

		junDev.addEmployee(emp4);
		itDept.addPosition(junDev);

		Position designer = new Position("Designer", "UX Designer", itDept);
		Employee emp6 = new Employee("006", "Brook", "Max", "Tilahun", "006", 5000, designer);

		designer.addEmployee(emp6);
		itDept.addPosition(designer);

		comp.addDepartment(itDept);

		comp.print();
		System.out.print("Company Total Salary: ");// CurrencyFormatter(amount));
		CurrencyFormatter(comp.getSalary());
		System.out.println();

	}

	public static void CurrencyFormatter(double amount) {

		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		System.out.print(formatter.format(amount));

	}

}