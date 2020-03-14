package assessments;
import java.util.*;
public class VotingMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		try {
			Voting v=new Voting();
			v.testAge(age);
		}
		catch(InsufficentAgeException e) {
			System.out.println(e);
		}
		catch(InvalidAgeException e) {
			System.out.println(e);
		}
		

	}

}
