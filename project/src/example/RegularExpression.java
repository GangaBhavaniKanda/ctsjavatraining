package example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Pattern p=Pattern.compile("[A-z]{3}[A-za-z@#$_]{4}[0-9]{3}");
		boolean res=p.matcher(str).matches();
		System.out.println(res);

	}

}
