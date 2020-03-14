import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Validation {

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		Pattern p=Pattern.compile("#[A-F0-9]{6}");
		Matcher m=p.matcher(str);
		boolean b=m.matches();
		if(b==true)
			System.out.println("valid color");
		else
			System.out.println("invalid color");
	

	}

}
