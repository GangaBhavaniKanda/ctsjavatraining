package assessments;
import java.util.*;
class UserMainCode25{
	public static int getDigitSum(String str) {
		int sum=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				sum=sum+Integer.parseInt(String.valueOf(str.charAt(i)));
			}
		}
		return sum;
	}
}

public class DigitSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("sum of digits in string "+UserMainCode25.getDigitSum(str));
	}

}
