package librarySystemApplication;

import java.util.Date;

public class Loan {

	private Date checkOutDate;
	private Date returnDate;
	private ItemCopy itemCopy;
	// private

	public Loan(Date checkOut, Date returnDate) {

		this.checkOutDate = checkOut;
		this.returnDate = returnDate;

	}

	public ItemCopy getItemCopy() {

		return itemCopy;
	}

	public void setItemCopy(ItemCopy copy) {
		this.itemCopy = copy;
	}
}