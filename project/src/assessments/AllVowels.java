package assessments;
import java.util.*;
class UserMainCode23{
	public static int testOrderVowel(String str) {
		String res="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
				res=res+str.charAt(i);
		}
		if(res.equals("aeiou"))
			return 1;
		else
			return -1;
	}
}
public class AllVowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
	if(UserMainCode23.testOrderVowel(str)==1)
				System.out.println("valid");
	else
		System.out.println("invalid");

	}

}
