package Streams;
import java.util.*;
public class MinMaxExample {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(10);
		list.add(5);
		list.add(0);
		list.add(100);
		list.add(156);
		list.add(109);
		Integer x=list.stream().max((a,b)->a<b?-1:1).get();
		System.out.println("max value:"+x);
	
		Integer y=list.stream().min((a,b)->a<b?-1:1).get();
		System.out.println("min value:"+y);
	
	}

}
