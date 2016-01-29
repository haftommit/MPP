/**
 * 
 */
package regularExpression;

/**
 * @author haftomtesfay
 *
 */
import javax.swing.JOptionPane;

public class ReplaceAllExcercise {
	private static final String STOP = "0";
	//private static final String VALID = "Valid phone number";
	//private static final String INVALID = "Not a valid License plate number";

	//private static final String VALID_PHONE_PATTERN
	// = "[a-zA-Z]{2}[0-9]{4}[a-zA-Z]{3}";
	//Write a regular expression for a license plate number whose format is two 
	//letters followed by four digits followed by three letters.
	// = "\\d{3}-\\d{3}-\\d{4}";

	public static void main (String[] args) {

		String license;

		while (true) {

			license = JOptionPane.showInputDialog(null, "License Plate Number:");

			if (license.equals(STOP)) break;

			if (!license.equals(STOP)) {
				JOptionPane.showMessageDialog(null,
						license + ":\n" + license.replaceAll("8","EIGHT"));

			} 

		}
	}

}