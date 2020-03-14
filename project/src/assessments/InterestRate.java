package assessments;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
class UserMain5{
	public static TreeMap calculateInterestRate(HashMap<String,String>h1,HashMap<String,Integer>h2) throws ParseException {
		TreeMap<String,Integer>t=new TreeMap<String,Integer>();
		String interest_date="01/01/2015";
		int amount=0;
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date d1=sdf.parse(interest_date);
		Set s1=h1.entrySet();
		Set s2=h2.keySet();
		Iterator it1=s1.iterator();
		
		while(it1.hasNext()) {
			Map.Entry me1=(Map.Entry)it1.next();
			String key=(String)me1.getKey();
			Date d2=sdf.parse((String)me1.getValue());
					 amount=(int)h2.get(key);
					Calendar cal=Calendar.getInstance();
					cal.setTime(d1);
					int y1=cal.get(Calendar.YEAR);
					cal.setTime(d2);
					int y2=cal.get(Calendar.YEAR);
					int age=y2-y1;
					if(age>=60){
						amount=(int) (amount+((0.1)*amount));
					}
					else if(age>=30 && age<60) {
						amount=(int) (amount+((0.07)*amount));
					}
					else 
					{
						amount=(int) (amount+((0.04)*amount));
					}	
					t.put(key, amount);
				}
				
		
		return t;
	}
}
public class InterestRate {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		HashMap<String,String>h1=new HashMap<String,String>();
		HashMap<String,Integer>h2=new HashMap<String,Integer>();
		System.out.println("enter no.of entries u want");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("enter id");
			String id=sc.next();
			System.out.println("enter date");
			h1.put(id,sc.next());
			System.out.println("enter amount");
			h2.put(id, sc.nextInt());
		}
		System.out.println(UserMain5.calculateInterestRate(h1, h2));
	}

}