//counting no.of objects created for class
package example;

 class Count {
	static int count;
	Count(){
		count++;
	}
	public void show() {
		System.out.println("no.of objects created:"+count);
	}

}
public class CountObj{
	public static void main(String args[]) {
		Count c1=new Count();
		Count c2=new Count();
		Count c3=new Count();
		Count c4=new Count();
		c4.show();
		
		
	}
	
}