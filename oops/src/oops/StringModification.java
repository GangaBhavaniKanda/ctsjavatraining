/*
 3.write a program to read a string and return a modified string based on the following ules
   ->return the string without the first 2 char except when
   ->keep the first char if it is 'j'
   -> keep the second char if it is 'b'
 */
package oops;
import java.util.Scanner;
class Question3{
	static String modifiedString(String str) {
		if(str.charAt(0)=='j' || str.charAt(1)=='b')
		          return str;
		else
			return str.substring(2);
		
		
	}
}
public class StringModification {

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		System.out.println(Question3.modifiedString(str));

	}

}
