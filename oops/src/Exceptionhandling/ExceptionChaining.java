//exception chaining in this exception object thrown implicitly
package Exceptionhandling;
class Test{
	public int f1() {
		int a=10,b=0;
		int c=a/b;
		return c;
	}
	public void f2() {
		int x=f1();
	}
}

public class ExceptionChaining{
	public static void main(String...args) {
		Test t=new Test();
		try {
			t.f2();
		}
		catch(Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("denominator zero");
		}
	}

}
