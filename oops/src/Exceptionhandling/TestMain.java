//user defined Exception
package Exceptionhandling;
import java.util.Scanner;
public class TestMain {

	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age:");
		age=sc.nextInt();
		Voting v=new Voting();
		try {
			v.testAge(age);
		}
		catch(InsufficientAgeException e) {
			System.out.println(e);
		}
		catch(InvalidAgeException e) {
			System.out.println(e);
		}

	}

}
