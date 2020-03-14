//predicate joining methods also return another
package predefinedFunctional_interfaces;

import java.util.function.Predicate;

public class PredicateExample3 {
	public static void main(String []args) {
		Predicate<Integer> p1=i->(i>10);
		Predicate<Integer> p2=i->(i%2==0);
		int arr[]= {10,0,5,15,20,25,30};
		System.out.println("The number is greater than 10:");
		m1(p1,arr);
		System.out.println("the number is even number:");
		m1(p2,arr);
		System.out.println("The number is greater than 10 and even");
		m1(p1.and(p2),arr);
		System.out.println("The number is greater than 10 or even");
		m1(p1.or(p2),arr);
		System.out.println("The number is not greater than 10");
		m1(p1.negate(),arr);
		
	}
	public static void m1(Predicate<Integer>p,int arr[]) {
		for(int ele:arr) {
			if(p.test(ele))
				System.out.println(ele);
		}
		
	}
	

}
