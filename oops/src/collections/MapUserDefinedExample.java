package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Stu{
	String name;
	int m1,m2;
	Stu(String name,int m1,int m2){
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		
	}
	@Override
	public String toString() {
		return "Stu [name=" + name + ", m1=" + m1 + ", m2=" + m2 + "]";
	}
	
}

public class MapUserDefinedExample {

	public static void main(String[] args) {
		Stu s=new Stu("bhavani",75,80);
		Stu s1=new Stu("ganga",70,85);
		Stu s3=new Stu("alekhya",90,20);
		Stu s4=new Stu("xyz",90,30);
		HashMap<String,Stu> hm=new HashMap<String,Stu>();
		hm.put("n130963", s);
		hm.put("130987572s", s1);
		hm.put("b456778", s3);
		hm.put("k5469", s4);
		Set entries=hm.entrySet();
		Iterator itr=entries.iterator();
		while(itr.hasNext()) {
			Map.Entry me=(Map.Entry)itr.next();
			Stu obj=(Stu) me.getValue();
			if(obj.m2<40)
				System.out.println(me.getKey()+" "+obj.name);
		}
		

	}

}
