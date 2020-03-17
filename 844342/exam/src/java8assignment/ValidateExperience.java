package java8assignment;
import java.util.*;
class UserMainCode6{
	public static boolean validateExp(String passout_year,String exp) {
		int curYear=2015;
		int passout=Integer.parseInt(passout_year);
		int exper=Integer.parseInt(exp);
		if((curYear-passout)>=exper)
			return true;
		else
			return false;
		
		
	}
}
public class ValidateExperience {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String passout_year=sc.nextLine();
		String exp=sc.nextLine();
		System.out.println(UserMainCode6.validateExp(passout_year, exp));
	
	}

}
