package example;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//predicate
		Predicate<Integer> p=x->x%2==0;
		System.out.println(p.test(8));
		
		//function
		Function<Integer,Double> f=y->3.14*y*y;
		System.out.println("area :"+f.apply(5));
		
		//bifunction
		BiFunction<Integer,Integer,Integer> bf=(x,y)->{
			if(x>y)
				return x;
			else
				return y;
		};
		System.out.println("largest number is:"+bf.apply(6, 12));
	}

}
