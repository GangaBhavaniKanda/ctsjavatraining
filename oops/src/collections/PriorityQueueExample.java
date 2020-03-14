package collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue p=new PriorityQueue();
		p.add(10);
		p.add(23);
		p.add(5);
		p.add(15);
		p.add(1);
		System.out.println(p);
		p.remove();
		System.out.println(p);
	}

}
