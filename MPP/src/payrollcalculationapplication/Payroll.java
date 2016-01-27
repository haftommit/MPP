/**
 * 
 */
package payrollcalculationapplication;

/**
 * @author haftomtesfay
 *
 */
import java.util.Calendar;
import java.util.Date;

public class Payroll {
	
	public static void main(String[] args){
		
		System.out.println("First Day " + DateRange.getFirstDayOfMonth((java.sql.Date) new Date()));
		System.out.println("Last Day " + DateRange.getLatDayOfMonth((java.sql.Date) new Date()));
		
		Calendar startDate = Calendar.getInstance();
		startDate.set(2016, 1, 1);
		Calendar endDate = Calendar.getInstance();
		endDate.set(2016, 1, 31);
		DateRange range = new DateRange(startDate, endDate);
		
		Employee emp = new Hourly ("Kibrom",10,20);
		
		 emp.calcCompensation(1, 2016).print();
		
	}

}