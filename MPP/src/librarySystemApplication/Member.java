/**
 * 
 */
package librarySystemApplication;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * @author haftomtesfay
 *
 */
public class Member {

	private String id;
	private String name;
	private String address;
	private String phone;

	ArrayList<Loan> loanList;
	ArrayList<Reservation> reservationList;

	public Member(String id, String name, String address, String phone) {

		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;

		loanList = new ArrayList<Loan>();
		reservationList = new ArrayList<Reservation>();
	}

	public void addReservation(Reservation reserve) {

		reservationList.add(reserve);
	}

	public void addLoan(Loan loan) {

		loanList.add(loan);
	}

	public void removeLoan(Loan loan) {
		loanList.remove(loan);
	}

	public void reserve(Item item) {

		if (!(item.checkAvailability())) {
			Reservation reserve = new Reservation(new Date(0), item);
			addReservation(reserve);
		}

	}

	public void borrow(ItemCopy item) {

		if (item.getAvailable()) {
			Date dateReturn = dateAdd(20);
			Loan loan = new Loan(new Date(0),dateReturn);// = new Loan(new Date(), dateReturn);
			loan.setItemCopy(item);
			addLoan(loan);
			item.setAvailable(false);
		}

	}

	public void returnItem(ItemCopy item) {
		for (Loan loan : loanList) {
			if (loan.getItemCopy().equals(item)) {
				//System.out.println("in return method");
				item.setAvailable(true);
				removeLoan(loan);
				
				break;
			}
		}

	}

	// A method used to add days to a date
	public Date dateAdd(int days) {
		Date dateNow = new Date(days);
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateNow);
		cal.add(Calendar.DATE, 20);

		return (Date) cal.getTime();
	}

}