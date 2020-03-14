//userdefined object sorting using comparable functional interface
package collections;

import java.util.Collections;
import java.util.LinkedList;

class Studenttt implements Comparable<Studenttt>{
	
	String htno;
	String name;
	Studenttt(String htno,String name){
		this.htno=htno;
		this.name=name;
	}
	@Override
	public String toString() {
		return "htno=" + htno + ", name=" + name + "";
	}
	@Override
	public int compareTo(Studenttt stu) {
		if(name.compareTo(stu.name)<0)
			return -1;
		else if(name.compareTo(stu.name)>0)
			return 1;
		else
			return 0;
	}
	
}

public class ComparableInterfaceExample {

	public static void main(String[] args) {
		Studenttt s1=new Studenttt("121","Ganga");
		Studenttt s2=new Studenttt("122","bhavani");
		Studenttt s3=new Studenttt("125","anitha");
		LinkedList list=new LinkedList();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println(list);
		Collections.sort(list);
		System.out.println("after sorting student class based name:");
		System.out.println(list);
		System.out.println("after reversing");
		Collections.reverse(list);
		System.out.println(list);
		/*Comparable c=(s)->{
			
			if(name.compareTo(s.name)<0)
				return -1;
			else if(name.compareTo(s.name)>0)
				return 1;
			else
				return 0;
		};
		c.compareTo(s1);*/
	

	}

}
