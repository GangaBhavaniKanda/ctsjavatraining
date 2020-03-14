//predicate joining and() or() negate()
package predefinedFunctional_interfaces;

import java.util.function.Predicate;

public class PredicateExample2 {

	public static void main(String[] args) {
	Predicate<Integer> greater=i->(i>=20);//greater than 20
	Predicate<Integer> even=i->(i%2==0);//even num or not
	System.out.println(greater.and(even).test(10));
	System.out.println(greater.or(even).test(10));
	System.out.println(greater.negate().test(10));

	}

}
