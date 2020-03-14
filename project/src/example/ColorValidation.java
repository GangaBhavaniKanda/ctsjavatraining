package example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ColorValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Pattern p=Pattern.compile("#[0-9A-F]{6}|#[0-9a-f]{6}");
		boolean res=p.matcher(str).matches();
		System.out.println(res);
	}

}
