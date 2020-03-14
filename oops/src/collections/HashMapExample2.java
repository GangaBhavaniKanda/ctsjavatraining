//write program using hashmap and store values in arraylist which starting with small letter and end with caps 
package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample2 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(844342, "Ganga");
		hm.put(800342, "bhvaniK");
		hm.put(114342, "gangaK");
		hm.put(8999342, "satishK");
		hm.put(56788, "Anitha");
		hm.put(875544, "maniK");
		hm.put(2346, "gangabhvaniK");
	ArrayList<String>list=new ArrayList<String>();
	Set entries=hm.entrySet();
	Iterator itr=entries.iterator();
	while(itr.hasNext()) {
		Map.Entry me=(Map.Entry)itr.next();
		String str=(String) me.getValue();
		int s=str.length();
		if(str.charAt(0)>=97 && str.charAt(0)<=122 && str.charAt(s-1)>=65 && str.charAt(s-1)<=90)
			list.add(str);
	}


	list.forEach(System.out::println);

}
}
