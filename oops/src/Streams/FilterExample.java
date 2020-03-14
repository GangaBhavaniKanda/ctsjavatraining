package Streams;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer>p=x->x%5==0;
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(10);
		list.add(2);
		list.add(25);
		list.add(9);
		list.add(3);
		
		System.out.println(list);
			Stream s=list.stream();
			List<Integer>l=(List<Integer>) s.filter(p).collect(Collectors.toList());
			System.out.println(l);
		
			//without collect display values
			list.stream().filter(x->x%2==0).forEach(System.out::println);

	}

}
