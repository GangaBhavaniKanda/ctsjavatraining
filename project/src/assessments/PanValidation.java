package assessments;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class UserMain{
	public static boolean testPan(String str) {
		Pattern p=Pattern.compile("[a-zA-Z]{5}[0-9]{4}[A-Z]{1}");
		Matcher m=p.matcher(str);
		boolean b=m.matches();
		return b;
	}
}
public class PanValidation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input string:");
		String str=sc.nextLine();
		if(UserMain.testPan(str)) {
			System.out.println("valid pan number");
		}
		else
			System.out.println("invalid pan number");
		

	}

}
