package example;
//object method reference
interface Exam{
	void sample();
}
class Sample1{
	void sample2() {
		System.out.println("fuctional interface using object method reference");
	}
}
//constructor method reference
interface Exp{
	void ready();
}
class Sam{
	Sam(){
		System.out.println("fuctional interface using constuctor method reference");
	}
}

public class ObjectMethodReference {

	
public static void main(String[] args) {
		Sample1 s=new Sample1();
		Exam e=s::sample2;
		e.sample();
		Exp ex=Sam::new;
		ex.ready();
	}

}
