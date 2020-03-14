package collections;

import java.util.ArrayList;
import java.util.Iterator;



public class IteratorExample {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("java");
		al.add(".net");
		al.add("selenium");
		Iterator itr= al.iterator();
		//System.out.println(itr.next());
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}


	}

}
