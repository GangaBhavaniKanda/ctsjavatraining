//1
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,revstr = "";
		int i,j,v_count=0;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		for(i=str.length()-1;i>=0;i--) {
			revstr=revstr+str.charAt(i);		
		}
		for(i=0;i<str.length();i++) {
			for(j=i+1;j<str.length();j++) {
				if((str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ) &&( str.charAt(j)=='a' || str.charAt(j)=='e' || str.charAt(j)=='i' || str.charAt(j)=='o' || str.charAt(j)=='u'))
				{
						if(str.charAt(i)!=str.charAt(j))
							v_count++;
				}
			}
			
		}

		if(str.equals(revstr))
		{
			if(v_count>=2) {
							System.out.println("palindrome and it consisting at least two different vowels");
			}
			else
				System.out.println("invalid");
		}
		else
			System.out.println("invalid");
	}

}
