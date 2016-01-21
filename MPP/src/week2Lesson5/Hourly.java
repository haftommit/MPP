package week2Lesson5;

/**
 * @author haftomtesfay
 *
 */
public class Hourly extends Employee {
	private static final int WEEKS_PER_MONTH = 4;
	private double hourlyWage;
	private double hoursPerWeek;
	
	public Hourly(String id, double hourlyWage, double hoursPerWeek) {
		super(id);
		// TODO Auto-generated constructor stub
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
	public double calcGrosspay() {
		// TODO Auto-generated method stub
		return hourlyWage * hoursPerWeek * WEEKS_PER_MONTH;
	}

}