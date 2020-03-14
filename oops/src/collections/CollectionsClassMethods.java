package collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassMethods {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("java");
		al.add("dotnet");
		al.add("selenium");
		al.add("oracle");
		System.out.println(al);
		
		System.out.println("after sorting");
		Collections.sort(al);
		System.out.println(al);
		
		System.out.println(" after reversing");
		Collections.reverse(al);
		System.out.println(al);
		
		ArrayList list=new ArrayList();
		/*
		Collections.copy(list, al);
		System.out.println(list);*/
		
		System.out.println("after filling");
		Collections.fill(al,"ganga");
		System.out.println(al);
		
		System.out.println("after disjoining");
		boolean b=Collections.disjoint(al, list);
		System.out.println(b);
		

	}

}
