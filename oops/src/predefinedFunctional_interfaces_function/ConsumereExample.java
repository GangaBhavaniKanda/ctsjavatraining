//consumer takes input without return type
package predefinedFunctional_interfaces_function;

import java.util.function.Consumer;

public class ConsumereExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String>c=s->System.out.println(s);
		c.accept("ganga");
		c.accept("bhavani");
		
		Consumer<Integer>c1=s->{
			if(s>=20)
				System.out.println("greater than 20");
			else
				System.out.println("less than 20");
		};

	}

}
