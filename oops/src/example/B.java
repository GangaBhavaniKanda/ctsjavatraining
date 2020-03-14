package example;
class A{
	int x;
	
}

class B extends A{
	B(){
		System.out.println("hello");
	}               
	public static void main(String[] args) {
		System.out.println("without constructor");

		new B();

	}

}
