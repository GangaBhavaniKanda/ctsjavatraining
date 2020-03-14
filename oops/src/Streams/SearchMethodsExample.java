package Streams;


import java.util.*;

public class SearchMethodsExample {

	public static void main(String[] args) {
		List<Integer>l=Arrays.asList(13,2,10,9,11);
		Optional<Integer>ans=l.stream().findAny();
		if(ans.isPresent()) {
			System.out.println(ans.get());
		}

	}

}
