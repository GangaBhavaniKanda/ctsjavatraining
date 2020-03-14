//6.write a program to read two string and one int value.check if nth character of 1st string from start and nth character of second string from last are same or not.if both are same return true else false;
package java_assignment;
import java.util.Scanner;
class Check{
	static boolean characterChecking(String str1,String str2,int pos)
	{
		int j,count=0;
		boolean flag = false;

		for(j=str2.length()-1;j>=0;j--)
		{
			count++;
			if(count==pos) {
				if(str1.charAt(pos-1)==str2.charAt(j))
					flag=true;
				else
					flag=false;
			}
			else
				continue;
		}
		if(flag)
			return true;
		else
			return false;
			
	}
}
public class CharacterCheckingIn2Str {

	public static void main(String[] args) {
		String str1,str2;
		int pos;
		Scanner sc=new Scanner(System.in);
		str1=sc.nextLine();
		str2=sc.nextLine();
		pos=sc.nextInt();
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		str2.toLowerCase();
		System.out.println(Check.characterChecking(str1, str2, pos));
		
	}

}
