//calling vowelscount static method in UserMain
package example;
import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		String str;
		System.out.println("enter input string:");
		Scanner s=new Scanner(System.in);
		str=s.next();
		System.out.println("total number of vowels in given string:"+UserMain.countVowels(str));
		s.close();

	}

}
