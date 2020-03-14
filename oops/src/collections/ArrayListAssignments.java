package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListAssignments {

	public static void main(String[] args) {
		//1.Write a Java program to create a new array list, add some colors (string) and print out the collection
		ArrayList list=new ArrayList();
		list.add("red");
		list.add("green");
		list.add("yellow");
		list.add("pink");
		System.out.println(list);
		//2.Write a Java program to iterate through all elements in a array list.
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//3.Write a Java program to insert an element into the array list at the first position.
		list.add(0,"white");
		System.out.println(list);
		//4.Write a Java program to retrieve an element (at a specified index) from a given array list
		System.out.println(list.get(3));
		
		//5.Write a Java program to update specific array element by given element
		//11.	Write a Java program to replace the second element of a ArrayList with the specified element.
		list.set(2,"blue");
		System.out.println(list);
		//6.Write a Java program to remove the third element from a array list.
		list.remove(3);
		System.out.println(list);
		
		//7.Write a Java program to search an element in a array list.
		boolean b=list.contains("red");
		if(b)
			System.out.println("element is found");
		else
			System.out.println("element is not found");
		//8.Write a Java program to sort a given array list.
		Collections.sort(list);
		System.out.println("after sorting the arraylist");
		System.out.println(list);
		
		//9.Write a Java program to extract a portion of a array list
		List sub_list=new ArrayList();
		sub_list=list.subList(1, 3);
		System.out.println(sub_list);
		
		//10. Write a Java program to join two array lists
		ArrayList list1=new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list.addAll(list1);
		System.out.println(list);
		
		//12.	Write a Java program to print all the elements of a ArrayList using the position of the elements.
		int n=list.size();
		for(int i=0;i<n;i++) {
			System.out.println(list.get(i));
		}
		
		
		
}			
	
}
