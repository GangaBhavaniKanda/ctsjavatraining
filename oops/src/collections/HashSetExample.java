package collections;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("red");
		hs.add("green");
		hs.add("null");
		hs.add("blue");
		hs.add("pink");
		hs.add("yellow");
		hs.add("white");
		hs.add("null");
		hs.forEach(System.out::println);
		

	}

}
