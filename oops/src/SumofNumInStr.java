//9
import java.util.Scanner;
public class SumofNumInStr {

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		int sum=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]>=97 && ch[i]<=122)
				continue;
			else {
				int val=Integer.parseInt(Character.toString(ch[i]));
				System.out.println(val);
				sum=sum+val;
			}
			
		}
System.out.println("sum of digits in given string:"+sum);
	}

}
