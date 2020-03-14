package assessments;
import java.util.*;
class UserMainCode24{
	public static String swapPair(String str) {
		StringBuffer sb=new StringBuffer();
		if(str.length()%2==0)
		{
			for(int i=0;i<str.length();i=i+2) {
				sb.append(str.charAt(i+1));
				sb.append(str.charAt(i));
			}
			return sb.toString();
			
		}
		else
		{
			for(int i=0;i<str.length()-1;i=i+2) {
				sb.append(str.charAt(i+1));
				sb.append(str.charAt(i));
			}
			sb.append(str.charAt(str.length()-1));
			return sb.toString();
			
		}
	}
}
public class AdjacentSwaps {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			System.out.println(UserMainCode24.swapPair(str));

	}

}
