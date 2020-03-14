package assessments;
import java.util.*;
class UserMain2{
	public static String modify(String str) {
		String str1=str.toLowerCase();
		StringBuffer sb=new StringBuffer(str1);	
		if(sb.charAt(0)!='j' && sb.charAt(1)!='b')
			return sb.substring(2).toString();
		else if(sb.charAt(0)=='j' && sb.charAt(1)!='b') {
			 sb.deleteCharAt(1);
			 return sb.toString();
		}
		else if(sb.charAt(0)!='j' && sb.charAt(1)=='b') {
			 sb.deleteCharAt(0);
			 return sb.toString();
		}
		else
			return sb.toString();
		
		
	}
}
public class ModifiedStr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(UserMain2.modify(str));
	}

}
