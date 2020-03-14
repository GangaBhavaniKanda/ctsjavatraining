//Example for interfaces
package example;

interface RBI{
	//by default c is constant
	int c=10;
	/*interface can't have constuctors
	RBI(){
		
	}*/
	void loan();
	void savings();
	void deposits();
	//default methods can be overridden in child classes
	default void socialService() {
		System.out.println("social service provided by rbi");
	}
	public static void insurance() {
		System.out.println("insurance provided by rbi");
	}
}
class HDFC implements RBI{
	public void loan() {
		System.out.println("HDFC provide loans for education");
	}
	public void savings() {
		//c++; we can't change it value
		System.out.println(c);
		System.out.println("HDFC rule for savings" );
		
	}
	public void deposits()
	{
		System.out.println("HDFC deposit rule");
	}
	public static void insurance() {
		System.out.println("insurance provided by Hdfc");
	}
}
class SBI implements RBI{
	public void loan() {
		System.out.println("SBI provide loans for education and agriculter");
	}
	public void savings() {
		System.out.println("SBI rule for savings" );
		
	}
	public void deposits()
	{
		System.out.println("SBI deposit rule");
	}
	public void socialService() {
		System.out.println("social service provided by sbi");
	}
	
}
public class InterfaceExample {

	public static void main(String[] args) {
		HDFC h=new HDFC();
		h.loan();
		h.savings();
		h.deposits();
		h.socialService();
		SBI s=new SBI();
		s.loan();
		s.savings();
		s.deposits();
		s.socialService();
		//static method is available in interface so we can't call static method on object of interface
		RBI.insurance();
		//static method call on class object
		h.insurance();
		HDFC.insurance();
		

	}

}
