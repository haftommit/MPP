package librarySystemApplication;

import java.util.Date;

public class Reservation {

	private Date reservationDate;
	private Item item;

	public Reservation(Date reservationDate, Item item) {

		this.reservationDate = reservationDate;
		this.item = item;
	}

	public boolean checkAvailability(Item item) {
		return item.checkAvailability();
	}

}