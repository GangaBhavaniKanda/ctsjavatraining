//abstract classes example
package example;
abstract class SuperMarket{
	public void goodsSelection() {
		System.out.println("products selection is based base class");
		
	}
	public void shipment() {
		System.out.println("products delivery is based base class");
	}
	//abstract method doesnot contains method body it must be implemented in child classes
	abstract public void payment();
}
class Market1 extends SuperMarket{
	public void payment() {
		System.out.println("payment through cash only");
	}
	public void insurance()
	{
		System.out.println("insurance is providen if any damage happend to products");
	}
}
class Market2 extends SuperMarket{
	public void payment() {
		System.out.println("payment through debit card only");
	}
	
}
public class AbstractExample {

	public static void main(String[] args) {
		//if we are using abstract class we can't create object directly to abstract class
		// SuperMarket s=new SuperMarket();
		Market1 m=new Market1();
		m.goodsSelection();
		m.payment();
		m.shipment();
		m.insurance();
		Market2 m2=new Market2();
		m2.goodsSelection();
		m2.payment();
		m2.shipment();
  
   
	}

}
