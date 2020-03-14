package assessments;
import java.util.*;
import java.util.Map.Entry;

class UserMainCode2 {
	
	public static int sum(TreeMap<Integer,Integer>hm) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		Set s=hm.entrySet();
		Iterator itr=s.iterator();
		int sum=0;
		while(itr.hasNext()) {
			Map.Entry me=(Map.Entry)itr.next();
			list.add((Integer) me.getValue());
		}
		Collections.sort(list);
		for(int i=0;i<3;i++) {
			sum=sum+(int)list.get(i);
		}
		return sum;
	}
	
	}
public class SumMin{

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		TreeMap<Integer,Integer>hm=new TreeMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
			hm.put(sc.nextInt(), sc.nextInt());
		}
		
	System.out.println(UserMainCode2.sum(hm));
	}


	}

