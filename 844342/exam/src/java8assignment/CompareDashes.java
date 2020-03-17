package java8assignment;
import java.util.*;
class UserMainCode1{
	public static int compareDashes(String str1,String str2) {
		int count=0;
		int c1=0,c2=0;
		int minlength=0;
		if(str1.length()<str2.length())
			minlength=str1.length();
		else
			minlength=str2.length();
		
		
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)=='-')
				c1++;
		}
		for(int i=0;i<str2.length();i++) {
			if(str2.charAt(i)=='-')
				c2++;
		}
		
		if(c1==c2) {	
			int j=0;
			for(int i=0;i<minlength;i++) {
				if(str1.charAt(i)=='-' && str2.charAt(j)=='-')
				{
					count++;
					j++;
				}
				else {
					j++;
					
				}
				
		}
		}
		
	if(count==c1)
		return 1;
	else
		return 2;
		
	}
}
public class CompareDashes {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		int res=UserMainCode1.compareDashes(str1, str2);
		if(res==1) {
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
	}

}
