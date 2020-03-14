package assessments;
import java.util.*;

class UserMainCode26{
	public static int pswdValidation(String str) {
		int nc=0,lc=0,sc=0;
		int res=0;
		if(str.length()>=8) {
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i)))
				nc++;
			else if(Character.isLetter(str.charAt(i)))
				lc++;
			else if(str.charAt(i)!=' ' || !Character.isDigit(str.charAt(i)) || !Character.isLetter(str.charAt(i)))
				sc++;
		}
		if(nc>=1 && lc>=1 && sc>=1)
			res=1;
		else
			res=-1;
		}
		else
			res=-1;
	return res;
	}
}

public class PasswordValidation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(UserMainCode26.pswdValidation(str)==1) {
			System.out.println("valid");
		}
		else
			System.out.println("Invalid");

	}

}
