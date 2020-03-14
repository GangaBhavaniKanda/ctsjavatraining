package Exceptionhandling;
public class EceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-geerated method stub
		int a=5,b=10;
		try {
			String str="hello";
			System.out.println(str.charAt(6));
			int c=a/b;
			System.out.println("the value of c:"+c);
			System.out.println("no exceptions occur.... ");
		}
		catch(ArithmeticException e) {
			System.out.println("inside catch block");
			System.out.println("the denominator is zero");
		}
		// catch defined exceptions that are most specific to general
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("char not availble in the index");
		}
		finally {
			System.out.println("inside finally  block");
		}
		System.out.println("program still continue");
			
		}

}
