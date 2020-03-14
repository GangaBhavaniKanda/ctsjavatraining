//tree set example
package collections;

import java.util.TreeSet;

class Emp implements Comparable<Emp>{
	String name;
	int id;
	String desg;
	Emp(String name,int id,String desg){
		this.name=name;
		this.id=id;
		this.desg=desg;
	}
	@Override
	public String toString() {
		return "name:"+name+" "+"id:"+id+" "+"desgination:"+desg;
		
	}
	@Override
	public int compareTo(Emp emp)
	{
		if(name.compareTo(emp.name)>0)
			return 1;
		else if(name.compareTo(emp.name)<0)
			return -1;
		else
			return 0;
	}
}

public class TreeSetExample {

	public static void main(String[] args) {
		Emp e=new Emp("bhanu",844342,"pat");
		Emp e1=new Emp("ganga",8443412,"devp");
		Emp e2=new Emp("anitha",9870,"manager");
		Emp e3=new Emp("satish",664342,"devp");
	TreeSet ts=new TreeSet();
	ts.add(e);
	ts.add(e1);
	ts.add(e2);
	ts.add(e3);
	ts.forEach(System.out::println);

	}

}
