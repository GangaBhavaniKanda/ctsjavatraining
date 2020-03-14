package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer>f=x->x*2;
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(10);
		list.add(2);
		list.add(25);
		list.add(9);
		list.add(3);
		
		System.out.println(list);
		list.stream().map(f).forEach(System.out::println);
		
		List<Integer> l=list.stream().map(x->x*5).collect(Collectors.toList());
		System.out.println(l);
		
	}

}
