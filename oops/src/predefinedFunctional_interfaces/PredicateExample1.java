package predefinedFunctional_interfaces;

import java.util.function.Predicate;

public class PredicateExample1 {

	public static void main(String[] args) {
		
		Predicate<String> p=str->(str.charAt(0)=='k');
		System.out.println(p.test("kanda"));
		
		String []arr= {"kanda","kamala","bhavani"};
		Predicate<String> ktest=s->s.charAt(0)=='k';
			for(String s:arr) {
				if(ktest.test(s))
					System.out.println(s);
			
		}

	}

}
