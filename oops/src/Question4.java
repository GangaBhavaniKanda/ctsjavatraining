//4
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		String str,st="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input string:");
		str=sc.nextLine();
		System.out.println("enter n value");
		int n=sc.nextInt();
		int i,j;
		for(i=0;i<n;i++) {
			st=st+str.charAt(i);
		}
		for(j=str.length()-n;j<str.length();j++) {
			st=st+str.charAt(j);
		}
		System.out.println("first n character and last n character for given string:"+st);

	}

}
