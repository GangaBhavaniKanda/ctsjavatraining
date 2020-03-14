//Supplier functional interface
package predefinedFunctional_interfaces_function;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<String> s=()->{
			 String s1[]= {"sunny","bunny","chinny","pinny"};
			 int x=(int) (Math.random()*4);
			 return s1[x];
			 
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
