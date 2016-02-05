package librarySystemApplication;

import java.util.Date;

public class LibrarySystemApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member member = new Member("001Ke", "kebede Gebru", "Fairfield st.", "+164198765");
		Item item1 = new Item("Book", true);
		ItemCopy item2 = new ItemCopy("Icp001",item1);
		Loan loan1 = new Loan(new Date(), member.dateAdd(20));
		item2.setLoan(loan1);
		item2.setAvailable(true);
		loan1.setItemCopy(item2);
		//System.out.println(loan1.getItemCopy().equals(item2));
		System.out.println(item2.getAvailable());
		member.borrow(item2);
		System.out.println(item2.getAvailable());
		member.returnItem(item2);
		System.out.println(item2.getAvailable());
	}

}