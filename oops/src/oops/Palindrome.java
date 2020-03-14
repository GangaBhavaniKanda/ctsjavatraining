//10.write a program to check string is palindrome or not
package oops;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		str=sc.nextLine();
		String revstr="";
			for(int i=str.length()-1;i>=0;i--) {
				revstr=revstr+str.charAt(i);
			}
			if(str.equals(revstr)) {
				System.out.println(str+" is palindrome");
			}
			else {
				System.out.println(str+" is not palindrome");
			}
			
			
		}
	}

