//compose , andThen methods in Function
package predefinedFunctional_interfaces_function;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String,String>f=s->s.toUpperCase();
		Function<String,String>f1=s->s.substring(0, 9);
		System.out.println(f.apply("gangabhavani"));
		System.out.println(f1.apply("gangabhavani"));
		System.out.println(f.andThen(f1).apply("gangabhavani"));//f->f1
		System.out.println(f.compose(f1).apply("gangabhavani"));//f1->f
		
		

	}

}
