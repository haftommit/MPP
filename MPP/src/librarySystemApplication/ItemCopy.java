package librarySystemApplication;

public class ItemCopy {

	private String copyId;
	private boolean available;

	private Item item;
	private Loan loan;

	public ItemCopy(String id, Item item) {

		this.copyId = id;
		this.item = item;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((copyId == null) ? 0 : copyId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemCopy other = (ItemCopy) obj;
		if (copyId == null) {
			if (other.copyId != null)
				return false;
		} else if (!copyId.equals(other.copyId))
			return false;
		return true;
	}

	public boolean getAvailable() {

		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

}