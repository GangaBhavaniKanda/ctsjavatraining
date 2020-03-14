//prime or not using predicate
package predefinedFunctional_interfaces;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<Integer> p=num->{
			int f=0;
			boolean b=false;
			for(int i=1;i<=num;i++) {
				if(num%i==0)
					f++;
			}
			if(f==2)
				b=true;
			else
			  b=false;
		
	return b;
		};
		System.out.println(p.test(6));

	}

}
