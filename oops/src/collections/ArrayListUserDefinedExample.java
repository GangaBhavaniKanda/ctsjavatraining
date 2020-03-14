//arraylist consisting of userdefined objects
package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

class Students{
	String htno;
	String name;
	Students(String htno,String name){
		this.htno=htno;
		this.name=name;
	}
	@Override
	public String toString() {
		return "htno=" + htno + ", name=" + name + "";
	}
	
}

public class ArrayListUserDefinedExample {

	public static void main(String[] args) {
		Students s1=new Students("121","ganga");
		Students s2=new Students("122","bhavani");
		Students s3=new Students("125","ganga");
		LinkedList list=new LinkedList();
		//ArrayList list=new ArrayList();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		System.out.println(list);
		//using iterator
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		// java1.8 foreach()
		list.forEach(System.out::println);
		
		//using listiterator class and it can be applied only list interface
		ListIterator it=list.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
			
		}
		System.out.println("revse priniting");
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		

	}

}
