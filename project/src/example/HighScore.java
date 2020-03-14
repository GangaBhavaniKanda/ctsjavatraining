//print topper name who is maximum marks of sum 
//String format name-m1-m2-m3
package example;
import java.util.*;
class UserMainCode{
	public static String highScoredStudent(ArrayList<String>list) {
		int i,max=0;
		String res="";
		for(i=0;i<list.size();i++) {
			int sum=0;
			String str[]=list.get(i).split("-");
			String topper=str[0];
			for(int k=1;k<str.length;k++) {
				sum=sum+Integer.parseInt(str[k]);
			}
			if(max<sum) {
				max=sum;
				res=topper;
			}
			
			
		}
		
		return res;
	}
}
public class HighScore {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			list.add(sc.next());
			
		}
		System.out.println("maximum scored student name is "+ UserMainCode.highScoredStudent(list));
	}

}
