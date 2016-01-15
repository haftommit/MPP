package week1Lesson2;

/**
 * @author haftomtesfay
 *
 */
public class HRApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company lagom = new Company("Lagom");
		Department hrDept = new Department("LagomHR","Addis Ababa",lagom);
		lagom.addDepartment(hrDept);
		
		Department itDept = new Department("IT","Mekelle",lagom);
		lagom.addDepartment(itDept);
		
		lagom.print();

	}

}