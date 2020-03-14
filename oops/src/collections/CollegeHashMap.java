package collections;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class CollegeGroups{
	String dept1;
	String dept2;
	String dept3;
	CollegeGroups(String dept1,String dept2,String dept3){
		this.dept1=dept1;
		this.dept2=dept2;
		this.dept3=dept3;
		
	}
	@Override
	public String toString() {
		return "CollegeGroups [dept1=" + dept1 + ", dept2=" + dept2 + ", dept3=" + dept3 + "]";
	}
	
}

//display college name which are having entered department using hashmap 
public class CollegeHashMap {

	public static void main(String[] args) {
		HashMap<String,CollegeGroups> hm=new HashMap<String,CollegeGroups>();
		hm.put("iiit", new CollegeGroups("CSE","ECE","MECH"));
		hm.put("JNTU", new CollegeGroups("CSE","ECE","CIVIL"));
		hm.put("AU", new CollegeGroups("CHEMICAL","CIVIL","MECH"));
		hm.put("OU", new CollegeGroups("CIVIL","CSE","MECH"));
		Set entries=hm.entrySet();
		Iterator itr=entries.iterator();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter branch:");
		String str=sc.nextLine();
		System.out.println("colleges which are having "+str+" are");
		while(itr.hasNext())
		{
			Map.Entry me=(Map.Entry)itr.next();
			CollegeGroups cg=(CollegeGroups) me.getValue();
			if(str.equals(cg.dept1) || str.equals(cg.dept2) || str.equals(cg.dept3))
				System.out.println(me.getKey());
		
		}
		

	}

}
