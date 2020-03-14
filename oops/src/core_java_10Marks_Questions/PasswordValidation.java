/*- Must contain at least one digit
- Must contain at least one of the following special characters @, #, $
# Length should be between 6 to 20 characters.*/

package core_java_10Marks_Questions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class pswdUserMainCode{
	public static int pswdValidation(String str) {
		Pattern p=Pattern.compile("[a-zA-Z0-9@#$]{6,20}");
		Matcher m=p.matcher(str);
		boolean b=m.matches();
		if(b)
			return 1;
		else
			return -1;
	}
}

public class PasswordValidation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		if(pswdUserMainCode.pswdValidation(str)==1)
			System.out.println("valid password");
		else
			System.out.println("invalid password");
		s.close();

	}

}
