/**
 * 
 */
package regularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author haftomtesfay
 *
 */

public class RegexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pattern = "\\bis\\b";
		String input = "Now is the time";

		Pattern pt = Pattern.compile(pattern);
		Matcher match =pt.matcher(input);
		if(match.matches())
			System.out.println("It perfectly matchs");
		else
			System.out.println("It does not match!");
		if(match.lookingAt())
			System.out.println("Found at the begining!");
		else
			System.out.println("It is not found at the begining");

		System.out.println("Matching: " + match.replaceAll("The first one to be replaceds here!"));
		//while(match.find()){
		//System.out.print(input.substring(match.start(), match.end()) + "*");
		//System.out.println(match.replaceAll("It is the first one to be tested"));
		//}
		//System.out.println(input);

		String pat = "[a-d[m-p]]";
		String oneinput;
		while(true){
			Scanner sc = new Scanner(System.in);
			oneinput = sc.nextLine();
			if(oneinput.matches(pat)){

			}
		}


	}

}

