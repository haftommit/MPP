/**
 * 
 */
package librarySystemApplication;

/**
 * @author haftomtesfay
 *
 */
import java.util.ArrayList;

public class Item {

	protected String title;
	protected boolean available;
	protected ArrayList<ItemCopy> itemCopy;

	public Item(String title, boolean available) {

		this.title = title;
		this.available = available;
		itemCopy = new ArrayList<ItemCopy>();
	}

	public boolean checkAvailability() {

		return this.available;
	}

	public void addItemCopy(ItemCopy copy) {

		itemCopy.add(copy);
	}

}