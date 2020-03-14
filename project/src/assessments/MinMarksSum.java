package assessments;
import java.util.*;
class UserMainCode1{
	public static int sum(HashMap<Integer,Integer>hm) {
		
		
		return 0;
		
	}
}
public class MinMarksSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
			hm.put(sc.nextInt(), sc.nextInt());
		}
		System.out.println(UserMainCode1.sum(hm));
	}

}
