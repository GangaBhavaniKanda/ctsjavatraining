//9.checking ip address value
package java_assignment;
import java.util.Scanner;
import java.util.regex.*;
public class CheckingIpAddress {
	public static void main(String []args) {
		String str;
		System.out.println("enter ip address");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		Pattern p=Pattern.compile("[0-255]{1}.[0-255]{1}.[0-255]{1}.[0-255]{1}");
		Matcher m=p.matcher(str);
		boolean b=m.matches();
		if(b)
			System.out.println("valid");
		else
			System.out.println("invalid");
		
	}
 
}
