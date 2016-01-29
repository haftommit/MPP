/**
 * 
 */
package regularExpression;

/**
 * @author haftomtesfay
 *
 */
import javax.swing.JOptionPane;

public class LicensePlateNumber {
	private static final String STOP = "0";
	private static final String VALID = "Valid license plate";
	private static final String INVALID = "Not a valid License plate number";

	private static final String VALID_PLATE
	= "[a-zA-Z]{2}[0-9]{4}[a-zA-Z]{3}";
	//Write a regular expression for a license plate number whose format is two 
	//letters followed by four digits followed by three letters.
	// = "\\d{3}-\\d{3}-\\d{4}";

	public static void main (String[] args) {

		String license, reply;

		while (true) {

			license = JOptionPane.showInputDialog(null, "License Plate Number:");

			if (license.equals(STOP)) break;

			if (license.matches(VALID_PLATE)) {
				reply = VALID;

			} else {
				reply = INVALID;
			}

			JOptionPane.showMessageDialog(null,
					license + ":\n" + reply);
		}
	}

}