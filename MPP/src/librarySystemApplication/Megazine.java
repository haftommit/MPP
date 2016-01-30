/**
 * 
 */
package librarySystemApplication;

/**
 * @author haftomtesfay
 *
 */
public class Megazine extends Item {

	private int limit;
	private int issue;

	public Megazine(String title, boolean available, int limit, int issue) {
		super(title, available);
		this.limit = limit;
		this.issue = issue;
		// TODO Auto-generated constructor stub
	}

}