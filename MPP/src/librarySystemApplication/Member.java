package librarySystemApplication;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

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
			Reservation reserve = new Reservation(new Date(), item);
			addReservation(reserve);
		}

	}

	public void borrow(ItemCopy item) {

		if (item.getAvailable()) {
			Date dateReturn = dateAdd(20);
			Loan loan = new Loan(new Date(),dateReturn);// = new Loan(new Date(), dateReturn);
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
		Date dateNow = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateNow);
		cal.add(Calendar.DATE, 20);

		return cal.getTime();
	}

}