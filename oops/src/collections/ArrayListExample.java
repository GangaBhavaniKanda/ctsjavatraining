package collections;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("java");
		al.add(".net");
		al.add("selenium");
		al.add("oracle");
		al.add(10);
		al.add(null);
		al.add(true);
		al.add("java");
		System.out.println(al);
		ArrayList al2=new ArrayList();
		al2.add("datascience");
		al2.add("python");
		al2.add("bigdata");
		al.addAll(al2);// al=al+al2
		System.out.println(al);
		
		
		if(al.contains("oracle"))
			System.out.println("element found");
		else
			System.out.println("element not found");
		al.remove("java");
		System.out.println(al);
		al.retainAll(al2);
		System.out.println(al);
		
		
		
		
		

	}

}
