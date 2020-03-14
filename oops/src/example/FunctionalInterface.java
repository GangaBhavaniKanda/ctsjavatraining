package example;
//Functional interface consisting of only one abstract method
interface Arithemetic{
	int add(int a,int b);
	
}

public class FunctionalInterface {

	public static void main(String[] args) {
	//lambda expression
		Arithemetic addition=(a,b)->a+b;
		System.out.println("sum"+addition.add(3, 5));
		
	}

}
