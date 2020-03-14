package assessments;
import java.util.*;
class UserMainCodex{
	public static int checkUnique(String str){
		StringBuffer sb=new StringBuffer(str);
		int len=sb.length();
		for(int i=0;i<len;i++) {
			int c=0;
			for(int j=i+1;j<len;j++) {
				if(sb.charAt(i)==sb.charAt(j)) {
					sb.deleteCharAt(j);
					c++;
					j--;
					len--;
				}
			}
			if(c>0) {
				sb.deleteCharAt(i);
				i--;
				len--;
			}
		}
		if(sb.length()==0)
			return -1;
		else
			return sb.length();
		
	}
}
public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
	System.out.println(UserMainCodex.checkUnique(str));
	}

}
