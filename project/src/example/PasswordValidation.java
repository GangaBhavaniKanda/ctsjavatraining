package example;
import java.util.*;
import java.util.regex.Pattern;

class UserMainCode100{
	public static boolean validatePassword(String str) {
	
		Pattern p=Pattern.compile("(?=.*[0-9])(?=.*[@#$]).{6,20}");
		boolean res=p.matcher(str).matches();
	return res;
	}
}
public class PasswordValidation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(UserMainCode100.validatePassword(str))
			System.out.println("valid");
		else
			System.out.println("invalid");
	}

}
