/**
 * 
 */
package regularExpression;

/**
 * @author haftomtesfay
 *
 */
import javax.swing.JOptionPane;
//This program chcecks emails
public class CheckEmail {

	private static final String STOP = "0";
	/*
 private static final String VALID = "Valid Email";
 private static final String INVALID = "Not a valid";
	 */

	private static final String VALID_EMAIL
	// = "[a-zA-Z]{2}[0-9]{4}[a-zA-Z]{3}";
	//Write a regular expression for a license plate number whose format is two 
	//letters followed by four digits followed by three letters.
	= "[a-zA-Z][a-zA-Z0-9_-]*[.]{0,1}[a-zA-Z0-9_-]*@(yahoo|gmail).com";

	public static void main (String[] args) {

		String email;

		while (true) {

			email = JOptionPane.showInputDialog(null, "Enter a string:");

			if (email.equals(STOP)) break;

			if (email.matches(VALID_EMAIL)) {
				JOptionPane.showMessageDialog(null,
						email + " is vaild email");

			} 
			else

				JOptionPane.showMessageDialog(null,
						email + " is not valid email");
		}
	}


}