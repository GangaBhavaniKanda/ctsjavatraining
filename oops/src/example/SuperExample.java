package example;
class GrandParent{
	GrandParent(){
		System.out.println("Inside the grand parent constructor");
	}
}
class Parent extends GrandParent{
	Parent(int x){
	System.out.println("Inside the parent constructor");
	}	
	
}
class Son extends Parent{
	X x= new X();
	int y=10;
	Son(){
		super(10);
		System.out.println("Inside the son constructor");
	}
}
class X{
	X(){
		System.out.println("Inside the x constructor");
	}
}
public class SuperExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s = new Son();

	}

}
