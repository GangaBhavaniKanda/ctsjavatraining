package collections;
import java.util.*;
public class HashMapExample5 {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(250);
		list.add(350);
		list.add(300);
		
		TreeSet<String>ts=new TreeSet<String>();
		ts.add("ganga");
		ts.add("bhavani");
		ts.add("satish");
		ts.add("savithri");
		ts.add("ramana");
		
		PriorityQueue<Integer> p=new PriorityQueue<Integer>();
		p.add(1);
		p.add(2);
		p.add(8);
		p.add(7);
		p.add(0);
		p.add(4);
		
		HashMap<String,Collection>hm=new HashMap<String,Collection>();
		hm.put("arraylist",list);
		hm.put("treeset",ts);
		hm.put("pqueue",p);
		Set entries=hm.entrySet();
		Iterator itr=entries.iterator();
		while(itr.hasNext()) {
			Map.Entry me=(Map.Entry)itr.next();
			Collection c=(Collection)me.getValue();
				System.out.println(me.getKey());
				c.forEach(System.out::println);
		}
		

	}

}
