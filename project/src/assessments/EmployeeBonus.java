package assessments;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
class UserMainCode27{
	public static void calculateRevisedSalary(HashMap<Integer,String>h1,HashMap<Integer,Integer>h2){
		TreeMap<Integer,Integer>tm=new TreeMap<Integer,Integer>();
		String d1="01-09-2014";
		Date date=null;
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		try {
			 date=sdf.parse(d1);
			} 
		catch (ParseException e) {
			}
		Set s1=h1.entrySet();
		Set s2=h2.keySet();
		Iterator itr1=s1.iterator();
		while(itr1.hasNext()) {
			Map.Entry me1=(Map.Entry)itr1.next();
			int id=(int) me1.getKey();
			Date d2=null;
			try {
				 d2=sdf.parse((String)me1.getValue());
			} 
			catch (ParseException e) {
			}
			Calendar c=Calendar.getInstance();
			c.setTime(date);
			int y1=c.get(Calendar.YEAR);
			c.setTime(d2);
			int y2=c.get(Calendar.YEAR);
			int age=y1-y2;
			int revisedSal=0;
			int salary=(int)h2.get(id);
					int bonus=0;
					if(age>=25 && age<=30)
					{
						bonus=(int) (0.2*salary);
						revisedSal=salary+bonus;
						
					}
					else if(age>=31 && age<=60) {
						bonus=(int) (0.3*salary);
						revisedSal=salary+bonus;
						//tm.put(id,revisedSal);
			
					}
					tm.put(id,revisedSal);
				}
		Iterator it=tm.keySet().iterator();
		while(it.hasNext()) {
			int id=(int) it.next();
			int sal=tm.get(id);
			System.out.println(id+" ="+sal);
			
		}
			}
			
		
		//return tm;
		//System.out.println(tm);

	}

public class EmployeeBonus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Integer,String>h1=new HashMap<Integer,String>();
		HashMap<Integer,Integer>h2=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
			int id=sc.nextInt();
			h1.put(id, sc.next());
			h2.put(id, sc.nextInt());
		}
		UserMainCode27.calculateRevisedSalary(h1, h2);
		//System.out.println(UserMainCode27.calculateRevisedSalary(h1, h2));
	}

}
