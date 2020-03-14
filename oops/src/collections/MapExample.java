package collections;

import java.util.HashMap;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("k1", "india");
		hm.put("k2", "japan");
		hm.put("k3", "swedan");
		hm.put("k4", "america");
		System.out.println(hm);
		// duplicate value
		hm.put("k5", "india");
		System.out.println(hm);
		//duplicate key
		hm.put("k1", "canada");
		System.out.println(hm);
		
		 
		
	}
	

}
