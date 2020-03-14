//increasing salaries of the employee whose designation is manager
package assessments;
import java.util.*;
class UserMainCode{
	public static HashMap<Integer,Double>increaseSalaries(HashMap<Integer,String>hm1,HashMap<Integer,Double>hm2){
		 HashMap<Integer,Double>res=new HashMap<Integer,Double>();
		 Set s=hm1.entrySet();
		 Set s1=hm2.entrySet();
		 Iterator itr=s.iterator();
		 Iterator itr1=s1.iterator();
		 while(itr.hasNext()) {
			 Map.Entry me=(Map.Entry)itr.next();
			 int id=(int)me.getKey();
			 String desg=(String)me.getValue();
			 while(itr1.hasNext()) {
				 Map.Entry me1=(Map.Entry)itr1.next();
				if(id==(int)me1.getKey() && desg.equalsIgnoreCase("manager")) {
					double sal=(double)me1.getValue()+5000;
					res.put(id, sal);
					break;
				}
				else
					break;
				 
			 }
			 
		 }
		 return res;
	}
}
public class CompanyIncrements {

	public static void main(String[] args) {
		HashMap<Integer,String>hm1=new HashMap<Integer,String>();
		HashMap<Integer,Double>hm2=new HashMap<Integer,Double>();
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		System.out.println("enter key and value");
		for(i=0;i<n;i++) {
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter desgination");
			hm1.put(id,sc.next());
			System.out.println("enter salary");
			hm2.put(id,sc.nextDouble());
		}
		HashMap<Integer,Double>res=UserMainCode.increaseSalaries(hm1, hm2);
		System.out.println("Employee whose designation is manager");
		System.out.println(res);
	

	}

}
