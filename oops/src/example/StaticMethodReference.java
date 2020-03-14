package example;
interface FunctionalInterface2{
	void sample();
}
class Example{
	 static void sample1()
	{
		System.out.println("functional interface using method reference");
	}
}

public class StaticMethodReference {

	public static void main(String[] args) {
		FunctionalInterface2 f=Example::sample1;
		f.sample();

	}

}
