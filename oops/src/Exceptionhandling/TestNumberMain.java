//user defined exception for even,odd number checking
package Exceptionhandling;
import java.util.Scanner;
public class TestNumberMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		TestNumber t=new TestNumber();
		try{
			t.testNumber(num);
		}
		catch(EvenNumberException e)
		{
			System.out.println(e);
		}
		catch(OddNumberException e)
		{
			System.out.println(e);
		}
	

	}

}
