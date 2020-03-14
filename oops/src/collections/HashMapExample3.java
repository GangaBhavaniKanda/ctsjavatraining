package collections;

import java.util.*;

public class HashMapExample3 {

	public static void main(String[] args) {
		
		HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of entries");
		int n=sc.nextInt();
		int i,year,noa;
		for(i=0;i<n;i++) {
			System.out.println("enter year");
			year=sc.nextInt();
			System.out.println("enter no of adimissions:");
			noa=sc.nextInt();
			hm.put(year, noa);
		}

		Set entries=hm.entrySet();
		
		Iterator itr=entries.iterator();
		int maxval=0,tyear=0;
		while(itr.hasNext()) {
			Map.Entry me=(Map.Entry)itr.next();
			int val=(int)me.getValue();
			
			if(val>maxval) {
				maxval=val;
				tyear=(int) me.getKey();
				
			}
			

	}
		System.out.println("the maximum admission are in the year "+tyear+" with "+maxval+" seats");
	}

}
