package week2Lesson5;

import java.sql.Date;
import java.util.Calendar;

/**
 * @author haftomtesfay
 *
 */
public class DateRange {

	private final Calendar startDate;
	private final Calendar endDate;

	public DateRange(Calendar start, Calendar end) {
		this.startDate = start;
		this.endDate = end;
	}

	public boolean isInRange(Date date) {

		Date startD = (Date) this.startDate.getInstance().getTime();
		Date endD = (Date) this.endDate.getInstance().getTime();
		return ((date.getTime() > startD.getTime()) && (date.getTime() > endD.getTime()));
	}

	public String toString() {

		return this.startDate.getTime() + " - " + this.endDate.getTime();
	}

	public static Date getFirstDayOfMonth(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 1);
		return (Date) cal.getTime();
	}

	public static Date getLatDayOfMonth(Date date) {

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH));

		return (Date) cal.getTime();

	}
}