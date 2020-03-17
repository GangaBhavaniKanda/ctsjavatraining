package java8assignment;
import java.util.*;
class UserMainCode4{
	public static String repeatFirstThreeCharacters(String str,int c) {
		int i=0;
		StringBuffer sb=new StringBuffer();
		if(str.length()<3) {
			for(i=0;i<c;i++)
				sb.append(str);
		}
		else {
			for(i=0;i<c;i++)
				sb.append(str.substring(0, 3));
		}
		return sb.toString();
		
	}
}
public class RepeatFirstThreeCharacters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int c=sc.nextInt();
		System.out.println(UserMainCode4.repeatFirstThreeCharacters(str, c));
		
		
	}

}
