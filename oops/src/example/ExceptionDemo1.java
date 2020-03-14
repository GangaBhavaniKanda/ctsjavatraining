package example;

import java.util.Scanner;

public class ExceptionDemo1 {
	public static void main(String []args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		try {
			int r=a/b;
			System.out.println("the quotient is"+r);
		}
		catch(java.lang.ArithmeticException e) {
			System.out.println("the error is"+e);
			
		}
		System.out.println("program continue");
	}
}
